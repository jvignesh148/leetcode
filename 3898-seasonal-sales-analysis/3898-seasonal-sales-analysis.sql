SELECT season, category, total_quantity, total_revenue
FROM (
  SELECT 
    CASE 
      WHEN MONTH(s.sale_date) IN (12,1,2) THEN 'Winter'
      WHEN MONTH(s.sale_date) IN (3,4,5) THEN 'Spring'
      WHEN MONTH(s.sale_date) IN (6,7,8) THEN 'Summer'
      ELSE 'Fall'
    END AS season,
    p.category,
    SUM(s.quantity) AS total_quantity,
    SUM(s.quantity*s.price) AS total_revenue,
    ROW_NUMBER() OVER (
      PARTITION BY 
        CASE 
          WHEN MONTH(s.sale_date) IN (12,1,2) THEN 'Winter'
          WHEN MONTH(s.sale_date) IN (3,4,5) THEN 'Spring'
          WHEN MONTH(s.sale_date) IN (6,7,8) THEN 'Summer'
          ELSE 'Fall'
        END
      ORDER BY SUM(s.quantity) DESC, SUM(s.quantity*s.price) DESC
    ) rn
  FROM sales s JOIN products p ON s.product_id=p.product_id
  GROUP BY season, p.category
) x
WHERE rn=1;

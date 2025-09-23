SELECT customer_id FROM 
(SELECT
    customer_id,
    SUM(CASE WHEN transaction_type='purchase' THEN 1 ELSE 0 END) AS p_transac,
    TIMESTAMPDIFF(MONTH,Min(transaction_date),MAX(transaction_date)) AS active,
    SUM(CASE WHEN transaction_type='refund' THEN 1 ELSE 0 END)/COUNT(*) AS rate
    FROM customer_transactions GROUP BY customer_id) x
WHERE x.p_transac>=3 AND x.active>=1 AND x.rate<0.2
ORDER BY customer_id;
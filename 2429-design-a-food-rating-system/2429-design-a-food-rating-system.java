class FoodRatings {
    class Food{
        String food;
        String cuisine;
        int rating;
        Food(String food,String cuisine,int rating){
            this.food=food;
            this.cuisine=cuisine;
            this.rating=rating; 
        }
    }
    HashMap<String,Food> map=new HashMap<>();
    HashMap<String,PriorityQueue<Food>> cmap=new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++){
            Food f=new Food(foods[i],cuisines[i],ratings[i]);
            map.put(foods[i],f);
            cmap.putIfAbsent(cuisines[i],new PriorityQueue<>((a,b)->
                    {if(a.rating!=b.rating) return b.rating-a.rating;
                    return a.food.compareTo(b.food);
                    }));
            cmap.get(cuisines[i]).offer(f);    
        }   
    }
    
    public void changeRating(String food, int newRating) {
        Food f=map.get(food);
        Food update=new Food(f.food,f.cuisine,newRating);
        map.put(food,update);
        cmap.get(f.cuisine).offer(update);
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq=cmap.get(cuisine);
        while(!pq.isEmpty()){
            Food temp=pq.peek();
            if(temp.rating!=map.get(temp.food).rating) pq.poll();
            else return temp.food;
        }
        return null;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
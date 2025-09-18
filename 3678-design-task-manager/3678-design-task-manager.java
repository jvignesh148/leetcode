class TaskManager {
    class Task{
        int userId,taskId,priority;
        Task(int userId,int taskId, int priority){
            this.userId=userId;
            this.taskId=taskId;
            this.priority=priority;
        }
    }
    HashMap<Integer,Task> map;
    TreeSet<Task> set;
    public TaskManager(List<List<Integer>> tasks) {
        map=new HashMap<>();
        set=new TreeSet<>((a,b) -> {if(b.priority!=a.priority) {
            return b.priority-a.priority;
            }
            return b.taskId-a.taskId;});
        for(List<Integer> list : tasks){
            Task curr=new Task(list.get(0),list.get(1),list.get(2));
            map.put(list.get(1),curr);
            set.add(curr);
        }    
    }
    
    public void add(int userId, int taskId, int priority) {
        Task curr=new Task(userId,taskId,priority);
        map.put(taskId,curr);
        set.add(curr);
    }
    
    public void edit(int taskId, int newPriority) {
        Task curr=map.get(taskId);
        set.remove(curr);
        curr.priority=newPriority;
        map.put(taskId,curr);
        set.add(curr);
    }
    
    public void rmv(int taskId) {
        Task curr=map.get(taskId);
        map.remove(taskId);
        set.remove(curr);
    }
    
    public int execTop() {
        if(set.isEmpty()) return -1; 
        Task result=set.pollFirst   ();
        set.remove(result);
        return result.userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
package Scheduler;

public class Schedule {

    /**
     * @param taskName Name of the task being created
     * @param taskType Type of task being created
     * @return verify if task is created
     */
    public boolean createTask(String taskName, String taskType){
        boolean created = true;

        //placeholder if-else statement
        if(created){
            return true;
        }else{
            return false;
        }

    }

    /**
     * @param taskName Name of the task being viewed
     */
    public void viewTask(String taskName){

    }

    /**
     * @param taskName Name of task being deleted
     * @return verify if task is deleted
     */
    public boolean deleteTask(String taskName){
        boolean deleted = true;

        if(deleted){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @param taskName Name of task being editted
     * @return verify if task is editted
     */
    public boolean editTask(String taskName){
        boolean edited = true;

        if(edited){
            return true;
        }else{
            return false;
        }
    }

}

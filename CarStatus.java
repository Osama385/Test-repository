package carasgn;


class CarStatus {

   private  String start;
   private  String stop;
   private  String running;

 CarStatus()
    {

 }
 CarStatus(String st,String sto,String run)
    {

    start=st;
    stop=sto;
    running=run;


 }

  
    public String getStart() {
        return start;
    }

  
    public void setStart(String start) {
        this.start = start;
    }

    
    public String getStop() {
        return stop;
    }

   
    public void setStop(String stop) {
        this.stop = stop;
    }

    
    public String getRunning() {
        return running;
    }

   
    public void setRunning(String running) {
        this.running = running;
    }






}

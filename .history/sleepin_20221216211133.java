class SleepIn{
  public boolean sleepIn(boolean weekday, boolean vacation) {
    if(!weekday || vacation) {
      return true;
    }
    return false;
  }
  
  public static void main(string [] args) {
    System.out.println(this.sleepIn())
  }
}
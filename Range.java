import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    this.start=start;
    this.end=end;
    current=start;
  }
  public void reset(){
    current=start;
  }
  public int length(){
    return (end-start+1);
  }
  public boolean hasNext(){
    if (current>end){
      return false;
    }
    else{
      return true;
    }
  }
  public int next(){
    if (hasNext()==false){
      throw new NoSuchElementException ("There is no value next in this sequence.");
    }
    current+=1;
    return (current-1);
  }

}

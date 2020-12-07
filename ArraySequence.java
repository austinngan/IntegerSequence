import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    currentIndex=0;
    data=other;
  }
  public void reset(){
    currentIndex=0;
  }
  public int length(){
    return (data.length);
  }
  public boolean hasNext(){
    if (currentIndex<data.length){
      return true;
    }
    return false;
  }
  public int next(){
    if (hasNext()==false){
      throw new NoSuchElementException ("There is no value next in this sequence.");
    }
    return (data[currentIndex++]);
  }
}

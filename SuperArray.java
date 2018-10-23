public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data= String[10];
    size=0;
  }
  public void clear(){
    size=0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return size==0;
  }
  public boolean add(String element){
    size++;
    data[size]=element;
    return size<11;
  }
  public String toString(){
    String value="[";
    for (int i = 0;i<size;i++){
      value+=size[i]+",";
    }
    value+="]"
    return value;
  }
  public String toStringDebug(){
    String value="[";
    for (int i = 0;i<10;i++){
      value+=size[i]+",";
    }
    value+="]"
    return value;
  }
  public String get(int index){
     if (index < 0 || index >= size()) return null;
     return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()) return null;
    data[index]=element;
    return this.toString();
  }
}

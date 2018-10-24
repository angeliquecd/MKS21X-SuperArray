public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data= new String[10];
    size=0;
  }
  public SuperArray(int x){
    data= new String[x];
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
    if (size>=data.length) resize();
    data[size]=element;
    size+=1;
    return size<11;
  }
  public String toString(){
    String value="[";
    for (int i = 0;i<size;i++){
      value+=data[i]+",";
    }
    if (size>0) value=value.substring(0,value.length()-1)+"]";
    else value+="]";
    return value;
  }
  public String toStringDebug(){
    String value="[";
    for (int i = 0;i<10;i++){
      value+=data[i]+",";
    }
    value+="]";
    return value;
  }
  public String get(int index){
     if (index < 0 || index >= size()) {
       return null;}
     else {return data[index]; }
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()) return null;
    String old=data[index];
    data[index]=element;
    return old;
  }
  private void resize(){
    String[] data1= new String[size*2];
    for (int i =0;i<size;i++){
      data1[i]=data[i];
    }
    data=data1;
  }
}

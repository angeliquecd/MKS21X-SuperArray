public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data= new String[10];
    size=0;
  }
  public SuperArray(int startingCapacity){
    data= new String[startingCapacity];
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
  public int lengthy(){
    return data.length;
  }
  public boolean add(String element){
    if (size>=data.length) resize();
    data[size]=element;
    size+=1;
    return true;
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
    if (data.length==0){
      return "[]";
    }
    String value="[";
    for (int i = 0;i<data.length-1;i++){
      value+=data[i]+",";
    }
    value+=data[data.length-1]+"]";
    return value;
  }
  public String get(int index){
     if (index < 0 || index >= size()) {
       throw new IndexOutOfBoundsException("Index out of bounds");
     }
       return data[index];
  }

  public String set(int index, String element){
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    String old=data[index];
    data[index]=element;
    return old;
  }
  private void resize(){
    if (size==0) data=new String[2];
    else{
          String[] data1= new String[size*2];
    for (int i =0;i<size;i++){
      data1[i]=data[i];
    }
    data=data1;
  }
  }
  public boolean contains(String target){
    for (int i =0;i<size;i++){
      if (data[i].equals(target))return true;
    }
    return false;
  }
  public int indexOf(String target){
    int index=0;
    for (int i =0;i<size;i++){
      if (data[i].equals(target)) return index;
      index++;
    }
    return -1;
  }
  public int lastIndexOf(String target){
    int last;
    for (int i =size-1;i>-1;i-=1){
      if (data[i].equals(target)) return i;
    }
    return -1;
  }
  public void add(int index, String element){
    if (index<0 || index>size) {
      throw new IndexOutOfBoundsException("Index out of bounds");}
    size++;
    String[] data1=new String[size];
    for (int i=0;i<index;i++){
      data1[i]=data[i];}
    for (int i = index;i<size-1;i++){
      data1[i+1]=data[i];
    }
    data1[index]=element;
    data=data1;
}
  public String remove(int index){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    String returny= data[index];
    size-=1;
    String[] data1=new String[data.length];
    for (int i=0;i<index;i++){
      data1[i]=data[i];
    }
    for (int i = index;i<size;i++){
      data1[i]=data[i+1];
    }
    data=data1;
    return returny;
  }
  public boolean remove(String element){
    if (!this.contains(element)) return false;
    this.remove(this.indexOf(element));
    return true;
  }
}

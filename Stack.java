public class Stack<T extends Object>{
    private int _length;
    private int _topIndex; // index where stack is empty, when it equals the length of the stack it means stack is full, when it equals 0 the stack is empty
    private T[] _data;
    
    public Stack(int length){
        _length = length;
        _topIndex = -1;
        _data = (T[]) new Object[length]; 
    }

    public boolean isEmpty(){
        return _topIndex <= -1; // idk how this could be less than -1, but just in case
    } 

    public boolean isFull(){
        return _topIndex >= _length-1;
    }

    public void push(T val){
        if(!isFull()){
            _topIndex++;
            _data[_topIndex] = val;
        }
    }

    public T pop(){
        if(!isEmpty()){
            T returnVal = _data[_topIndex];
            _data[_topIndex] = null;
            _topIndex--;
            return returnVal;
        }
        return null;
    }

    public T peek(){
        return isEmpty()? null: _data[_topIndex]; 
    }
    
    public void print(){
        if(isEmpty()){
            System.out.print("[]");
        }else{
            System.out.print("[");
            for(int i = 0; i < _topIndex; i++){
                System.out.print(" "+_data[i]+",");
            }
            System.out.print(" "+_data[_topIndex]+" ]");
        }
    }

    public void println(){
        if(isEmpty()){
            System.out.print("[]\n");
        }else{
            System.out.print("[");
            for(int i = 0; i < _topIndex; i++){
                System.out.print(" "+_data[i]+",");
            }
            System.out.print(" "+_data[_topIndex]+" ]\n");
        }
    }
}

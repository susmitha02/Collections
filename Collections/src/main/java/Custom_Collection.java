import java.util.Arrays;

public class Custom_Collection<T> {
	private int listSize = 0;
	private static final int InitialSIZE = 10;
	private Object listVal[];
	
	public Custom_Collection() 
	{
		listVal = new Object[InitialSIZE];
    }
	
	public void addElement(T t) 
	{
		if (listSize == listVal.length) {
            Capacity();
        }
        listVal[listSize++] = t;
    }
	
	public int size() 
	{
		return listSize;
	}
	
	public T removeElement(int i) 
	{
	    if (i > listSize || i < 0) 
	    {
	        throw new IndexOutOfBoundsException("Of index: " + i + "& size =" + i);
	    }
	    Object value = listVal[i];
	    int remlen = listVal.length - (i) ;
	    System.arraycopy( listVal,i,listVal,i-1,remlen ) ;
	    listSize--;
	    return (T)value;
	}
	 
	public T getElementByIndex(int i) 
	{
		if (i > listSize || i < 0) 
		{
	        throw new IndexOutOfBoundsException("Of index: " + i + "& size " + i);
	    }
		return (T) listVal[i-1];
	}
	 
	private void Capacity() {
        int expSize = listVal.length * 2;
        listVal = Arrays.copyOf(listVal, expSize);
    }
	
	@Override
	public String toString() 
	{
		String str= "[";
	    for(int i = 0; i < listSize ;i++) 
	    {
	    	str += listVal[i].toString();
	        	if(i < listSize-1)
	        	{
	                 str += " , ";
	             }
	     }
	     str += ']';
	     return str;
	}
}
package insertSort;

class ArrayIns {

    private long[] a;
    private int nElems;

    public ArrayIns(int max)
    {
        a = new long[max];
        nElems = 0;

    }

    public void insert(long value)
    {
        a[nElems] = value;
        nElems ++;

    }


    public void display()
    {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j]+" ");
        System.out.println( " ");

    }

    public void insertionSort()
    {
        int in,out;
        
        for(out=1; out<nElems; out++)
        {
            long temp = a[out];
            in = out;
            while(in>0&&a[in-1] >=temp)
                {
                    a[in] = a[in - 1];
                    --in;

                }
            a[in] = temp;
        
        }
    }
    
    public double median()
    {

        int n = nElems;

        if(n%2!=0)
            return a[n/2];
        return (double)(a[(n-1)/2]+a[n/2])/2;


    }

    public void noDups(){  
        
        
   
        int j = 0; 
        for (int i=0; i < nElems-1; i++){  
            if (a[i] != a[i+1]){  
                a[j++] = a[i]; 
                
            }  
        }  
        a[j++] = a[nElems-1];  
        nElems = j;
        
    } 
}

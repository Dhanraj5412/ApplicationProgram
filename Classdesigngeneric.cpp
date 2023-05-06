#include<iostream>

using namespace std;

template< class T>
class MarvellousArray
{
   private:
           T *Arr;
          int iSize;

   public:
   template<class T>
   MarvellousArray(int Length)
   {
    cout<<"inside constructor"<<"\n";
      iSize = Length;
      Arr= new T [iSize];
   }
   
   ~MarvellousArray()
   {
    cout<<"inside destructor"<<"\n";
    delete []Arr;
    
   }
   
   void Accept()
   {
    cout<<"enter the values :"<<"\n";
    for(int i=0; i< iSize; i++)
    {
        cin>>Arr[i];
    }
   }
   
   void Display()
   {
    cout<<"elements of array are :"<<"\n";
    for(int i=0; i<iSize; i++)
    {
        cout<<Arr[i]<<"\n";
    }
   }
   
   T Addition()
    {
       T iSum=0 ;
       for(int i=0; i<iSize; i++)
       {
        iSum = iSum + Arr[i];
       }
       return iSum;
    }

};

int main()
{
    
    MarvellousArray<int> mobj1(6);
    MarvellousArray<float> mobj2(4);

    mobj1.Accept();
    mobj1.Display();

    mobj2.Accept();
    mobj2.Display();

     int iRet = 0;
     iRet= mobj1.Addition();
     cout<<"Addition of  mobj1 :"<<iRet<<"\n";
     
     float fRet=0.0;
     fRet= mobj2.Addition();
     cout<<"Addition of  mobj2 :"<<iRet<<"\n";
     
    return 0;
}
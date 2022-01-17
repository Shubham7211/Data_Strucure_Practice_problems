#include<iostream>
using namespace std;

bool search(int arr[], int size, int key){
    for (int i = 0; i < size; i++)
    {
        if (arr[i]==key)
        {
            return 1;
            /* code */
        }
        
            }
    
return 0;
}

int main(){
    int arr[10]={-1, -2,-3,4,5,6,7,8,9,10};
    cout<<"enter the element for serch in array"<<endl;
    int key;
    cin>>key;
    bool found= search(arr, 10, key);
if (found)
{
cout<<"element is present in the list"<<endl;
    /* code */
}else{
    cout<<"element is not found"<<endl;
}


}

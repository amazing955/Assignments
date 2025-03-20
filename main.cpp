#include <iostream>
using namespace std;

#define _size 5

int main() {

int arr[_size]={1,2,3,4,5};
int comp = sizeof arr/sizeof arr[0];
for(int i=0;i<_size;i++){
    cout<<arr[i]<<""<<endl;
}
    return 0;
}

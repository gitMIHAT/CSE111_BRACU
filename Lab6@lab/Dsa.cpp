#include <bits/c++.h>
using namespace std;

int main(){
    int N;
    cin>> N;
    for(int i=1;i<sqrt(N);i++){
        cout<< i << N/i <<endl;
    }
    return 0;
}
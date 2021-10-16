/* CPP program to find if x is a
perfect square.*/
#include <bits/stdc++.h>
using namespace std;
 
bool isPerfectSquare(long double x)
{
    if (x >= 0) {
 
        long long sr = sqrt(x);
         
        return (sr * sr == x);
    }

    return false;
}
 
int main()
{
    long long x = 2502;
    if (isPerfectSquare(x))
        cout << "Yes";
    else
        cout << "No";
    return 0;
}

/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int i;
    for (i = 0; i < 100; ++i)
    {
        if((i+1)%3 == 0 && (i+1)%5 == 0) {
            printf("FooBaa\n");
        } else if((i+1)%3 == 0) {
            printf("Foo\n");
        } else if((i+1)%5 == 0) {
            printf("Baa\n");
        }
    }

    return 0;
}
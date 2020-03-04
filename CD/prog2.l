%{
#include<stdio.h>
%}

%%
[\t|" "]+$ ;
[\t|" "]+ printf(" ");
%%


int main(int argc[],char *argv[])
{
yylex();
return 0;
}

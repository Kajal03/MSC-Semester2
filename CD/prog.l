%{
#include<stdio.h>
%}

%%
[\t|" "]+$ ;
%%


int main(int argc[],char *argv[])
{

yylex();
return 0;
}
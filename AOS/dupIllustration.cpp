#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

int main()
{
	int i, j;
	char buf1[512], buf2[512] ;
	i = open ("in.txt", O_RDONLY) ;
	j = dup(i);  //unique entry in ufdt, same entry in file table that means shared offset
	
	read (i, buf1 , sizeof(buf1));
	printf("%s",buf1);

	read (j , buf2, sizeof(buf2));
	printf("%s",buf2);

	close (i);
	read (j, buf2, sizeof(buf2));
	printf("%s",buf2);
}

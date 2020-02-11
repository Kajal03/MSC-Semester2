#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

int main ()
{
	int fd1 , fd2;
	char buf1[512] , buf2[512];

	fd1 = open("in.txt", O_RDONLY);  //byte offset = 0 
	fd2 = open ("in.txt", O_RDONLY); //byte offset = 0 
					  //two descriptors for the same file...both of them will have unique entry in ufdt and file table
	read(fd1 , buf1 , sizeof(buf1));  //both buffers will read the same
	printf("%s \n",buf1);

	read (fd2, buf2, sizeof(buf2));
	printf("%s \n",buf2);
}

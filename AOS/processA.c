#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
// process A 

int main ()
{
	int fd;
	char buff[512];
	fd = open("in.txt", O_RDONLY) ;
	read(fd, buff, sizeof(buff) ) ; //read 1
	printf("%s \n",buff);

	sleep(1);
	read (fd, buff, sizeof(buff) ) ; //read 2
	printf("%s \n",buff);
}

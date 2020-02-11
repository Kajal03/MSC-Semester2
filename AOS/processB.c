#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
// process B 
int main ()
{

	int fd, i;
	char buff[512];
	for (i = 0; i < sizeof(buff) ; i++)
		buff[i] = 'a';
	fd = open ("in.txt", O_WRONLY) ;
	sleep(1);
	write(fd, buff, sizeof(buff)) ; //write 1
	
	sleep(5);
	write(fd, buff, sizeof(buff)) ;  //write2
}

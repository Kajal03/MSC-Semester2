#include<fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
#include <sys/stat.h>

char string[] = "hello";
int main (int argc, char *argv[])
{
	int fd;
	char buf[256];
	// create named pipe with read/write permission for all users 
	mknod("fifo", 010777, 0) ;
	if (argc == 2)
		fd = open ("fifo", O_WRONLY) ;
	else
		fd = open ("fifo", O_RDONLY) ;
	for (;;)
	{
		if (argc == 2)
			write(fd, string, 6) ;
		else
		{
			int n = read (fd, buf, 6) ;
			printf("%d",n);
			printf("%s",buf);
		}
	}
}

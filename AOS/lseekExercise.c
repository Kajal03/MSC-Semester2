#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

int main()
{

	int fd, a;
	char buf[1024];
	fd = creat("junk", 0666) ;
	lseek(fd, 2000L, 2) ;
	write(fd, "hello", 5) ;
	close(fd) ;
	/* seek to byte 2000 */
	
	fd = open("junk", O_RDONLY) ;
	/* read zero's */
	a=read (fd, buf, 1024) ;
	printf("%d \n",a);
	printf("%s \n",buf);

	a=read(fd, buf, 1024) ;
	printf("%d \n",a);
	printf("%s \n",buf);
	/* catch something */
	a=read(fd, buf, 1024) ;
	printf("%d \n",a);
	printf("%s \n",buf);
}

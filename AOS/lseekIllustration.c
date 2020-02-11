#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

int main ()
{

	int fd, skval;
	char c;

	fd = open("in.txt", O_RDONLY) ;

	if (fd == -1)
		exit(1);

	while ((skval = read(fd, &c, 1 ) ) == 1 )
	{
		printf("char %c\n", c) ;
		skval = lseek(fd, 1023L, 1 ) ;
		printf("new seek val %d\n", skval) ;
	}
}

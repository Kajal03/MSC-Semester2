#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

char string[] = "hello";
int main()
{
	char buf[1024];
	char *cp1 , *cp2;
	int fds[2];
	cp1 = string;
	cp2 = buf;
	while(*cp1)
	{
		*cp2++ = *cp1++;
	}

	pipe(fds);
	for (;;)
	{
		write(fds[1], buf, 6) ;
		read(fds[0], buf, 6) ;
	}
}

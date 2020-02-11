#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

int main ()
{

	int fd1, fd2, skval;
	char c, buff[512];

	for (int i = 0; i < sizeof(buff) ; i++)
		buff[i] = 'a';

	fd1 = creat("sample.txt", 0107770) ;

	write(fd1, buff, sizeof(buff)) ; //write 1
	lseek(fd1, 5000L, 1 ) ; //skipped one block

	write(fd1, buff, sizeof(buff)) ; //write 2

	close(fd1);

	fd2 = open("sample.txt", O_RDONLY) ;

	while ((skval = read(fd2, &c, 1 ) ) == 1 )
	{
		printf("%c", c) ;
		//skval = lseek(fd, 1023L, 1 ) ;
		//printf("new seek val %d\n", skval) ;
	}
}

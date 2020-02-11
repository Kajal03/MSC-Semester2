#include <fcntl.h>
#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
int main()
{
	int fd;
	char lilbuf[10], bigbuf[1024], medbuf[100];

	fd = open("in.txt", O_RDONLY) ;
	int a = read(fd, lilbuf, 50);    // size of buffer < count
					 //size of lilbuf is 20 characters, still reading more than 20 characters and even displaying them
	printf("%s \n",lilbuf);
	printf("%d \n",a);


	a = read(fd, bigbuf, 1024);  //size of buffer = count
	printf("%s \n",bigbuf);
	printf("%d \n",a);

	a = read(fd, medbuf, 20);   //size of buffer > count
	printf("%s \n",medbuf);
	printf("%d \n",a);
}

## An Introduction to IPFS

Imagine a world where streaming a high-quality video on YouTube suffers no buffering, disrupted internet connection doesn’t refrain you from working and where governments can’t block sites on their whims or
shut internet services down.

## What are the issues with the current Web?

1. Enormous Data ​ — ​ With the advent of the internet, humanity has collected nearly 130 exabytes of data. This data is exponentially growing with the growing number of internet
users. This means that we will have more people streaming a significant amount of data on channels that are not scaling at the same pace. This would create congestion. Even addition of hardware would not be able to solve this problem at one point in time.

2. Centralized ​ — ​ The current web is centralized. There is a single point of failure. This can lead to internet censorship by an organization. Such an organization would be able to take advantage of the monopoly granted to it by having control of this centralised resource. Services could be controlled or even shut down.

Clearly, problems exist. A solution to these problems is the use of a brand new internet protocol, the Interplanetary File System.

## IPFS

Juan Benet in 2014 designed an Internet Protocol commonly known as IPFS or Interplanetary File System with the objective of removing duplications across the network, keeping data indefinitely and acquire addresses to the information stored on computers in the network. The HTTP is location-oriented as it fetches information by pointing to locations. But IPFS is resource-oriented i.e. it points to the resource and fetches information in parts from different machines over the network making it decentralized.

Consider a situation where you are sitting in a classroom with 100 students and everyone is asked to stream the same 4k video on YouTube. The video will be retrieved from the closest YouTube server to each of the 100 machines. Everyone would end up requesting and receiving a large amount of data over long distances, congesting the network.

Using IPFS in the above scenario, the students would fetch the video from one another, thereby, making a 4k video stream bufferless using fewer resources than the inefficient method used by HTTP above.

But how is IPFS different from the BitTorrent protocol? BitTorrent has a separate group of users who share a single file or torrent. If a video exists in two different languages then there would be two swarms(peers sharing a torrent). They would not be able to share anything although both the swarms are carrying the content that is 99% identical. With IPFS, the entire World Wide Web can be contemplated as a huge torrent file that is shared by everyone. Also, BitTorrent does not support all data types and it contains duplicate data which adds up to the data congestion problems.

IPFS generates a unique cryptographic hash for every file submitted to it that depends on the
content and hence achieves deduplication of data. It tracks version history that pre-empts information from being easily removed.

## Misconceptions about IPFS

1. Data stored on IPFS is persistent ​ — ​ Using cryptography, IPFS stores data on the network as long as the network believes that it is beneficial to do so. IPFS encourages data storage using cryptocurrencies like Filecoin.

2. IPFS is built on Blockchain ​ — ​ IPFS uses architectural elements similar to Merkle Trees but they are meant to work together with prevailing Blockchain protocols and not build on top of them. Blockchain provides public verifiability of data whereas IPFS provides public accessibility of data.

## Are there any applications with IPFS and Blockchain?

1. Intellectual Property ​ — ​ Arts, music, programs, source code, etc face the problem of plagiarism. IPFS and blockchain can encourage content creators by providing a comprehensive ecosystem for them to work on. Revenue channels, in this case, can be driven by smart contracts, identity protection, a reputation-based collaboration network and more.

2. Social Networks ​ — ​ Blockchain and IPFS can provide users with an absolute decentralized social networking experience where content creation can be awarded cryptocurrencies. Example, Akasha and Steemit.

3. Free E-commerce ​ — ​ ​ Unlike traditional e-commerce sites like Amazon and e-Bay that charge fees for registering or selling items, an online marketplace can be created using IPFS that would not be centrally controlled and hence would not charge merchants. The trade would be peer-to-peer without any middleman.  OpenBazaar being an example.

4. Cryptocurrencies ​ — ​ Since a massive amount of data storage around the world sits unused, one could use it to store data for IPFS and gain credits in the form of FileCoin or other such cryptocurrencies. These transactions are stored in blockchains.

IPFS is a conceptually and technically complex protocol that has soaring ambitions to revolutionize the way data is exchanged across the Internet. There is no doubt that HTTP helped the internet become what we know it as today. But, with emerging technology and the need for a distributed infrastructure, IPFS will certainly work better.


main.out:     file format elf64-x86-64


Disassembly of section .init:

00000000004003c8 <_init>:
  4003c8:	48 83 ec 08          	sub    $0x8,%rsp
  4003cc:	48 8b 05 25 0c 20 00 	mov    0x200c25(%rip),%rax        # 600ff8 <__gmon_start__>
  4003d3:	48 85 c0             	test   %rax,%rax
  4003d6:	74 05                	je     4003dd <_init+0x15>
  4003d8:	e8 43 00 00 00       	callq  400420 <.plt.got>
  4003dd:	48 83 c4 08          	add    $0x8,%rsp
  4003e1:	c3                   	retq   

Disassembly of section .plt:

00000000004003f0 <.plt>:
  4003f0:	ff 35 12 0c 20 00    	pushq  0x200c12(%rip)        # 601008 <_GLOBAL_OFFSET_TABLE_+0x8>
  4003f6:	ff 25 14 0c 20 00    	jmpq   *0x200c14(%rip)        # 601010 <_GLOBAL_OFFSET_TABLE_+0x10>
  4003fc:	0f 1f 40 00          	nopl   0x0(%rax)

0000000000400400 <puts@plt>:
  400400:	ff 25 12 0c 20 00    	jmpq   *0x200c12(%rip)        # 601018 <puts@GLIBC_2.2.5>
  400406:	68 00 00 00 00       	pushq  $0x0
  40040b:	e9 e0 ff ff ff       	jmpq   4003f0 <.plt>

0000000000400410 <__libc_start_main@plt>:
  400410:	ff 25 0a 0c 20 00    	jmpq   *0x200c0a(%rip)        # 601020 <__libc_start_main@GLIBC_2.2.5>
  400416:	68 01 00 00 00       	pushq  $0x1
  40041b:	e9 d0 ff ff ff       	jmpq   4003f0 <.plt>

Disassembly of section .plt.got:

0000000000400420 <.plt.got>:
  400420:	ff 25 d2 0b 20 00    	jmpq   *0x200bd2(%rip)        # 600ff8 <__gmon_start__>
  400426:	66 90                	xchg   %ax,%ax

Disassembly of section .text:

0000000000400430 <_start>:
  400430:	31 ed                	xor    %ebp,%ebp
  400432:	49 89 d1             	mov    %rdx,%r9
  400435:	5e                   	pop    %rsi
  400436:	48 89 e2             	mov    %rsp,%rdx
  400439:	48 83 e4 f0          	and    $0xfffffffffffffff0,%rsp
  40043d:	50                   	push   %rax
  40043e:	54                   	push   %rsp
  40043f:	49 c7 c0 a0 05 40 00 	mov    $0x4005a0,%r8
  400446:	48 c7 c1 30 05 40 00 	mov    $0x400530,%rcx
  40044d:	48 c7 c7 1d 05 40 00 	mov    $0x40051d,%rdi
  400454:	e8 b7 ff ff ff       	callq  400410 <__libc_start_main@plt>
  400459:	f4                   	hlt    
  40045a:	66 0f 1f 44 00 00    	nopw   0x0(%rax,%rax,1)

0000000000400460 <deregister_tm_clones>:
  400460:	b8 37 10 60 00       	mov    $0x601037,%eax
  400465:	55                   	push   %rbp
  400466:	48 2d 30 10 60 00    	sub    $0x601030,%rax
  40046c:	48 83 f8 0e          	cmp    $0xe,%rax
  400470:	48 89 e5             	mov    %rsp,%rbp
  400473:	77 02                	ja     400477 <deregister_tm_clones+0x17>
  400475:	5d                   	pop    %rbp
  400476:	c3                   	retq   
  400477:	b8 00 00 00 00       	mov    $0x0,%eax
  40047c:	48 85 c0             	test   %rax,%rax
  40047f:	74 f4                	je     400475 <deregister_tm_clones+0x15>
  400481:	5d                   	pop    %rbp
  400482:	bf 30 10 60 00       	mov    $0x601030,%edi
  400487:	ff e0                	jmpq   *%rax
  400489:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)

0000000000400490 <register_tm_clones>:
  400490:	b8 30 10 60 00       	mov    $0x601030,%eax
  400495:	55                   	push   %rbp
  400496:	48 2d 30 10 60 00    	sub    $0x601030,%rax
  40049c:	48 c1 f8 03          	sar    $0x3,%rax
  4004a0:	48 89 e5             	mov    %rsp,%rbp
  4004a3:	48 89 c2             	mov    %rax,%rdx
  4004a6:	48 c1 ea 3f          	shr    $0x3f,%rdx
  4004aa:	48 01 d0             	add    %rdx,%rax
  4004ad:	48 d1 f8             	sar    %rax
  4004b0:	75 02                	jne    4004b4 <register_tm_clones+0x24>
  4004b2:	5d                   	pop    %rbp
  4004b3:	c3                   	retq   
  4004b4:	ba 00 00 00 00       	mov    $0x0,%edx
  4004b9:	48 85 d2             	test   %rdx,%rdx
  4004bc:	74 f4                	je     4004b2 <register_tm_clones+0x22>
  4004be:	5d                   	pop    %rbp
  4004bf:	48 89 c6             	mov    %rax,%rsi
  4004c2:	bf 30 10 60 00       	mov    $0x601030,%edi
  4004c7:	ff e2                	jmpq   *%rdx
  4004c9:	0f 1f 80 00 00 00 00 	nopl   0x0(%rax)

00000000004004d0 <__do_global_dtors_aux>:
  4004d0:	80 3d 55 0b 20 00 00 	cmpb   $0x0,0x200b55(%rip)        # 60102c <_edata>
  4004d7:	75 11                	jne    4004ea <__do_global_dtors_aux+0x1a>
  4004d9:	55                   	push   %rbp
  4004da:	48 89 e5             	mov    %rsp,%rbp
  4004dd:	e8 7e ff ff ff       	callq  400460 <deregister_tm_clones>
  4004e2:	5d                   	pop    %rbp
  4004e3:	c6 05 42 0b 20 00 01 	movb   $0x1,0x200b42(%rip)        # 60102c <_edata>
  4004ea:	f3 c3                	repz retq 
  4004ec:	0f 1f 40 00          	nopl   0x0(%rax)

00000000004004f0 <frame_dummy>:
  4004f0:	48 83 3d 28 09 20 00 	cmpq   $0x0,0x200928(%rip)        # 600e20 <__JCR_END__>
  4004f7:	00 
  4004f8:	74 1e                	je     400518 <frame_dummy+0x28>
  4004fa:	b8 00 00 00 00       	mov    $0x0,%eax
  4004ff:	48 85 c0             	test   %rax,%rax
  400502:	74 14                	je     400518 <frame_dummy+0x28>
  400504:	55                   	push   %rbp
  400505:	bf 20 0e 60 00       	mov    $0x600e20,%edi
  40050a:	48 89 e5             	mov    %rsp,%rbp
  40050d:	ff d0                	callq  *%rax
  40050f:	5d                   	pop    %rbp
  400510:	e9 7b ff ff ff       	jmpq   400490 <register_tm_clones>
  400515:	0f 1f 00             	nopl   (%rax)
  400518:	e9 73 ff ff ff       	jmpq   400490 <register_tm_clones>

000000000040051d <main>:
  40051d:	55                   	push   %rbp
  40051e:	48 89 e5             	mov    %rsp,%rbp
  400521:	bf c0 05 40 00       	mov    $0x4005c0,%edi
  400526:	e8 d5 fe ff ff       	callq  400400 <puts@plt>
  40052b:	5d                   	pop    %rbp
  40052c:	c3                   	retq   
  40052d:	0f 1f 00             	nopl   (%rax)

0000000000400530 <__libc_csu_init>:
  400530:	41 57                	push   %r15
  400532:	41 89 ff             	mov    %edi,%r15d
  400535:	41 56                	push   %r14
  400537:	49 89 f6             	mov    %rsi,%r14
  40053a:	41 55                	push   %r13
  40053c:	49 89 d5             	mov    %rdx,%r13
  40053f:	41 54                	push   %r12
  400541:	4c 8d 25 c8 08 20 00 	lea    0x2008c8(%rip),%r12        # 600e10 <__frame_dummy_init_array_entry>
  400548:	55                   	push   %rbp
  400549:	48 8d 2d c8 08 20 00 	lea    0x2008c8(%rip),%rbp        # 600e18 <__init_array_end>
  400550:	53                   	push   %rbx
  400551:	4c 29 e5             	sub    %r12,%rbp
  400554:	31 db                	xor    %ebx,%ebx
  400556:	48 c1 fd 03          	sar    $0x3,%rbp
  40055a:	48 83 ec 08          	sub    $0x8,%rsp
  40055e:	e8 65 fe ff ff       	callq  4003c8 <_init>
  400563:	48 85 ed             	test   %rbp,%rbp
  400566:	74 1e                	je     400586 <__libc_csu_init+0x56>
  400568:	0f 1f 84 00 00 00 00 	nopl   0x0(%rax,%rax,1)
  40056f:	00 
  400570:	4c 89 ea             	mov    %r13,%rdx
  400573:	4c 89 f6             	mov    %r14,%rsi
  400576:	44 89 ff             	mov    %r15d,%edi
  400579:	41 ff 14 dc          	callq  *(%r12,%rbx,8)
  40057d:	48 83 c3 01          	add    $0x1,%rbx
  400581:	48 39 eb             	cmp    %rbp,%rbx
  400584:	75 ea                	jne    400570 <__libc_csu_init+0x40>
  400586:	48 83 c4 08          	add    $0x8,%rsp
  40058a:	5b                   	pop    %rbx
  40058b:	5d                   	pop    %rbp
  40058c:	41 5c                	pop    %r12
  40058e:	41 5d                	pop    %r13
  400590:	41 5e                	pop    %r14
  400592:	41 5f                	pop    %r15
  400594:	c3                   	retq   
  400595:	90                   	nop
  400596:	66 2e 0f 1f 84 00 00 	nopw   %cs:0x0(%rax,%rax,1)
  40059d:	00 00 00 

00000000004005a0 <__libc_csu_fini>:
  4005a0:	f3 c3                	repz retq 

Disassembly of section .fini:

00000000004005a4 <_fini>:
  4005a4:	48 83 ec 08          	sub    $0x8,%rsp
  4005a8:	48 83 c4 08          	add    $0x8,%rsp
  4005ac:	c3                   	retq   

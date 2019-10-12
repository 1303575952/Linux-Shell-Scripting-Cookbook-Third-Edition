# 第2章 命令之乐
## 2.2 用cat进行拼接
shell在打开输入文件之前会先创建新的输出文件。cat命令不允许使用相同的文件作为输入和重定向后的输出。利用管道并重定向输出会清空输入文件。
```
$> echo "This will vanish" > myfile 
$> cat -n myfile >myfile 
cat: myfile: input file is output file 
$> cat myfile | cat -n >myfile 
$> ls -l myfile 
-rw-rw-rw-. 1 user user 0 Aug 24 00:14 myfile ; # myfile为空文件
```
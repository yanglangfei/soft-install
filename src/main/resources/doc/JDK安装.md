### 安装JDK
- 卸载之前的版本
  - 查询LINUX系统是否已安装
    - rpm -qa | grep java 或者 rpm -qa | grep jdk
  - 卸载查询到的版本
    - rpm -e --nodeps java-1.8.0-openjdk-headless-1.8.0.161-2.b14.el7.x86_64
    - rpm -qa | grep java 或 rpm -qa | grep jdk 命令来查询出是否删除掉
- 下载jdk，并上传到服务器
- 解压 jdk
    - tar  -zxvf  jdk-8u131-linux-x64.tar.gz
- 新建安装目录，将加压的jdk移到新目录
    - mkdir /usr/java
    - mv jdk1.8.0_131 /usr/java  
- 修改环境变量
    - vim /etc/profile
       export JAVA_HOME=/usr/java/jdk1.8.0_131
       export JRE_HOME=${JAVA_HOME}/jre
       export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib:$CLASSPATH
       export JAVA_PATH=${JAVA_HOME}/bin:${JRE_HOME}/bin
       export PATH=$PATH:${JAVA_PATH}
- source /etc/profile 让profile文件立即生效
- javac    java -version   测试是否安装成功
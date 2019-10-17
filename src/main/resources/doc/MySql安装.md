### MySql 安装
- 下载并解压MySql
   -  tar -xvzf mysql.tar.gz -C /usr/local/mysql
- 创建数据目录
   - 　mkdir /data/mysql/{data,logs,tmp}
- 授权数据目录和软件目录
   - useradd mysql
   - chown -R mysql.mysql /data/mysql
   - chown -R mysql.mysql /usr/local/mysql
- 配置
   - 查看一下有没有/etc/my.cnf文件  如果没有将/usr/local/mysql/my.cnf 拷贝到/etc下
   - 修改 my.conf
       basedir=/usr/local/mysql
    　 datadir=/data/mysql/data
    　 tmpdir = /data/mysql/tmp
    　 log-error= /data/mysql/logs/error.log
       slow_query_log_file = /data/mysql/logs/slow.log
    　　general_log_file = /data/mysql/logs/mysql.log
       server-id=100
    　　log-bin = /data/mysql/data/mysql-bin
    　　log-bin-index = /data/mysql/data/mysql-bin.index
    　　relay-log = /data/mysql/logs/relay-log
    　　relay_log_index = /data/mysql/logs/relay-log.index
- 安装依赖包
     1.如果已经安装了libnuma.so.1，先yum remove libnuma.so.1
     2.yum -y install numactl.x86_64
- 初始化 mysql
    - ./mysqld --basedir=/usr/local/mysql --datadir=/data/mysql/data --defaults-file=/etc/my.cnf --user=mysql
    - ./mysqld --initialize
     
   

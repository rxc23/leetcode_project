## 后端技术学习指南

+ 基础知识

    + 操作系统

        + 内存管理
        + 文件系统
        + IO
        + 进程
        + 线程
        + 调度
        + 分时操作系统等等设计思路

    + 数据结构

        + 线性表
            + 链表（可以使用零散的内存）
            + 数组 （数组的优势远不止检索性能快，结合组成原理思考，在JVM层面内存分配和GC都很有意义）
            + SkipList（查询性能O(log(0))，在LSM存储引擎中常用于memtable）

        + 树
            + 二叉树
            + BST、AVL
            + Trie
            + Heap
            + RB-Tree
            + B-Tree
            + B+ Tree
            + R-Tree、STR-Tree（用户空间化检索）

        + 图

            + DAG

        + Bitmap
            + bitmap
            + roraing-bitmap

        + BloomFilter
        + 基数预估

            + LogLogCount
            + LogLogCountPlus
            + HyperLogLog

        + LRUCache（做到时间复杂度O(1)

    + 算法

        + 排序
        + 链表相关
        + 树的遍历及构建
        + 分治算法
        + 贪心算法
        + DFS
        + BFS
        + 回溯
        + 动态规划
        + 字符串
            + KMP
            + BM
        + 状态机
        + 并查集
        + 递归（Lisp爱好者可以大胆的使用尾递归）
        + 双指针、滑窗
        + 限流算法（流量塑性）
            + 令牌桶
            + 漏桶
            + 滑动窗口
            + 计数器

    + 计算机网络

        + TCP
            + 三次握手、4次挥手

            + `TIME_WAIT`与`CLOSE_WAIT`
            + TCP的流量控制

        + UDP
        + HTTP

## Java

+ 《OnJava8》 Think In Java的作者，针对Java8写的，之前是免费开源的，现在作者已经收起来出书了。
    + [OnJava8-Examples](https://github.com/BruceEckel/OnJava8-Examples)
    + [中文版](https://github.com/Syasuker/OnJava8-zh)

+ 《深入理解Java虚拟机 3》 周志明，比较系统的介绍了JVM的知识体系，能够让人对JVM有一个宏观的认识。

+ 《深入理解Java虚拟机——G1GC的算法与实现》中村成洋的作品，比较全面的介绍了G1的实现算法。补充一个，中村成洋在GC算法方面还有另外一本书《垃圾回收的算法与实现》

+ 《新一代垃圾回收器ZGC设计与实现》可以作为学习ZGC的一个参考，书本虽然部分知识已经过期，但是整体还是可以作为参考。除了Oracle的ZGC，Redhat的SGC可以了解一下，此外Azual的GC，代表了当前的GC的最高水准。

+ 关于GC可以参考R大在知乎、JavaEye的总结和回答。R大目前基本上算法在中文社区内最权威的专家之一。

+ 《Java并发编程实战》大师的作品，对于Java的并发体系最权威的书籍。

+ 《Effective Java 3 》写出合理而且高质量的Java代码的最佳实践。

+ 源码学习
    + Java collection包和concurrent包下面的各种集合类和工具。collection学习数据结构，concurrent包下学习并发大师doug lea的各种并发工具的实现。
    + Disruptor：高性能的Java异步框架。可以重点学习RingBuffer的实现、无锁并发、缓存行填充解决伪共享、如何在并发的情况下，针对共享资源同步影响范围最小化。代表了当前最高性能的Java组件之一。
    + Guava和Apache commons下工具类的实现。

## 数据库（RDMS& NOSQL）

+ 《MySQL技术内幕——InnoDB存储引擎》MySQL界的大咖姜承尧的作品，作为大数据体系知识系统学习的入门经典的中文学习资料。

+ 《数据库系统内幕》非常全面的一部讲述数据库实现体系的书籍。英文版本《Database Internals》

+ [《cmu的关于数据库恢复原理的课件》](https://15415.courses.cs.cmu.edu/spring2015/slides/24Recovery1.pdf)

+ [CMU的数据库课件地址](https://15415.courses.cs.cmu.edu/spring2015/slides/)

+ [《Designing Data-Intensive Application 》大名鼎鼎的DDIA，中文名称《数据密集型应用》](https://github.com/Vonng/ddia)

+ [存储的Paper，包含LSM-Tree及其优化、分布式等等。](https://github.com/BaronStack/book_paper)

+ 《Redis的设计与实现》国内比较系统的介绍Redis的一本书，质量还是不错的，可以作为学习参考。不过对于分布式方案，解决过于简单，对于Slave Rank等知识并未讲解。可以结合英文官方文档参考学习。

+ HBase的资料。
    + 《HBase原理与实践》HBase的Committer合作写的，整体质量还是不错的。
    + 网易范欣欣的《有态度的HBase》系列博客
    + HBase官方文档及源码

+ RocksDB。官方文档相当详细。

## 分布式共识性协议

+ [Paxos](https://github.com/baidu/braft/blob/master/docs/cn/paxos_protocol.md)

+ [Hadoop的QJM机制](https://github.com/baidu/braft/blob/master/docs/cn/qjm.md)

+ [Raft协议](https://raft.github.io/)

    + [Raft协议中文](https://github.com/maemual/raft-zh_cn)
    + [Raft协议动画](http://thesecretlivesofdata.com/raft/)
    + [百度braft，一个非常好的学习raft资料](https://github.com/baidu/braft/blob/master/docs/cn/raft_protocol.md)
    + [蚂蚁金服的Jraft](https://www.sofastack.tech/projects/sofa-jraft/raft-introduction/)


+ [ZAB协议](http://www.tcs.hut.fi/Studies/T-79.5001/reports/2012-deSouzaMedeiros.pdf)
    + [ZAB协议中文](https://github.com/baidu/braft/blob/master/docs/cn/zab_protocol.md)
+ [PacificA](https://www.microsoft.com/en-us/research/publication/pacifica-replication-in-log-based-distributed-storage-systems/)应用：
    + Kafka
    + pegasus

+ [Gossip协议](https://zhuanlan.zhihu.com/p/41228196)
+ Amazon DynamoDB NWR
+ 一致性哈希

## 分布式事务

+ 2PC

+ 3PC
+ TCC
+ Saga事务模型
+ Percolator

## 大数据入门基础

+ MapReduce的原理

+ HDFS的读写流程

+ HDFS的元数据一致性的保证机制QJM

+ Hive ——SQL On Hadoop的经典代表。

+ HBase 稀疏式表格存储，K-V存储

+ ORC/Avro：存储格式

## 流式计算系统

+ Streaming 101 、102 、103三篇经典论文
+ [《Streaming System》](flink/Streaming Systems .pdf)将101、102、103等论文合并起来，根据google的dataflow的模型的流处理书籍。
+ Flink
    + WaterMark的意义：
        1. 解决相对乱序问题
        2. 解决延迟问题
    + WaterMark的传播机制
    + 分布式异步快照，这是flink的数据一致性及Recover的基础。
        + [flink分布式异步快照paper](flink/flink-asyncnoros-snapshot-(abs).pdf)
        + [ABS中文解读](https://mp.weixin.qq.com/s?__biz=MzI0ODM1MzkzOA==&mid=2247483673&idx=1&sn=91197659211ade0b2ddd96c2f8ad4c45&chksm=e9a344e4ded4cdf2bd8e19011848c1c52e1c1e80d9b3af58866f03240d22285ef0a92ba359e6&scene=21#wechat_redirect)
    + 流式系统的背压机制
    + [StateBackend原理](flink/flink-state-manage-vldb.pdf)

## Message System(Queue)

+ Kafka
+ Pulsar
+ RabbitMQ
+ RocketMQ

## Columns Store File Format

+ ORC
+ Parquet

## 。。。未完待续。。。。
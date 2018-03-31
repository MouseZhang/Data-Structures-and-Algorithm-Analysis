# 数据结构和算法Java实现

## 目录

- [一、数组](#一、数组)
- [二、简单排序](#二、简单排序)
- [三、栈和队列](#三、栈和队列)
- [四、链表](#四、链表)
- [五、双端链表和双向链表](#五、双端链表和双向链表)
- [六、递归的应用](#六、递归的应用)
- [七、递归的高级应用](#七、递归的高级应用)
- [八、希尔排序](#八、希尔排序)
- [九、快速排序](#九、快速排序)
- [十、二叉树的基本概念](#十、二叉树的基本概念)
- [十一、二叉树的基本操作](#十一、二叉树的基本操作)
- [十二、遍历二叉树](#十二、遍历二叉树)
- [十三、删除二叉树节点](#十三、删除二叉树节点)
- [十四、红黑树](#十四、红黑树)
- [十五、哈希表](#十五、哈希表)
- [十六、开放地址法](#十六、开放地址法)
- [十七、链地址法](#十七、链地址法)
- [十八、图的基本概念](#十八、图的基本概念)
- [十九、图的搜索](#十九、图的搜索)
- [二十、图的最小生成树](#二十、图的最小生成树)

---

## 一、[数组](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH01)

### (一)、数组的基础知识

- 1、创建数组

- 2、访问数组数据项

- 3、数组的初始化

### (二)、面向对象编程方式

- 1、使用自定义类封装数组

- 2、添加类方法来实现数据操作

### (三)、有序数组

- 1、有序数组简介及其优点

- 2、构建有序数组

### (四)、查找算法

- 1、线性查找算法

- 2、二分法查找算法

---

## 二、[简单排序](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH02)

### (一)、冒泡排序

### (二)、选择排序

### (三)、插入排序

---

## 三、[栈和队列](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH03)

### (一)、栈的构造和应用

### (二)、队列的构造和应用

---

## 四、[链表](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH04)

---

## 五、[双端链表和双向链表](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH05)

### (一)、双端链表

- 1、什么是双端链表:
  链表中保存着对最后一个链结点引用的链表叫做双端链表。

- 2、从头部进行插入:
  要对链表进行判断，如果为空则设置尾结点为新添加的结点。

- 3、从尾部进行插入:
  如果链表为空，则直接设置头结点为新添加的结点，否则设置尾结点的后一个结点为新添加结点。

- 4、从头部进行删除:
  判断头结点是否有下一个结点，如果没有则设置结点为null。

### (二)、双向链表

- 1、什么是双向链表:
  每个结点除了保存了对下一个结点的引用，同时还保存着对前一个结点的引用。

- 2、从头部进行插入:
  要对链表进行判断，如果为空则设置尾结点为新添加的结点。如果不为空，还需要设置头结点的前一个结点为新添加的结点。

- 3、从尾部进行插入:
  如果链表为空，则直接设置头结点为新添加的结点，否则设置尾结点的后一个结点为新添加结点。同时设置新添加的结点的前一个结点为尾结点。

- 4、从头部进行删除:
  判断头结点是否有下一个结点，如果没有则设置结点为null。否则设置头结点的下一个结点的Previous为null。

- 5、从尾部进行删除:
  如果头结点后没有其他结点，则设置尾结点为null。否则设置尾结点前一个结点的next为null。设置尾结点为其前一个结点。

- 6、删除方法:
  不需要再使用一个临时的指针域。

---

## 六、[递归的应用](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH06)

### (一)、递归

- 递归是一种方法调用自己的编程技术。

### (二)、三角数字

- 该数列中的第n项是由第n-1项加n得到的。

### (三)、Fibonacci数列

- 该数列的第1项为0，第二项为1，第n项为第n-1项加上n-2项得到。

---

## 七、[递归的高级应用](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH07)

### (一)、汉诺塔

- 1、汉诺塔的问题:
  所有的盘子刚开始都放在塔座A上，要求将所有的盘子从塔座A移动到塔座C上，每次只能移动一个盘子，任何盘子不能放在比自己小的盘子上。

- 2、移动子树
- 3、递归的解决

---

## 八、[希尔排序](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH08)

### (一)、希尔排序的产生

- 希尔排序是由科学家Donald L.Shell提出来的，希尔排序基于插入排序，并添加了一些新的特性，从而大大的提高插入排序的执行效率。

### (二)、插入排序的缺陷

- 假如一个很小的数据在靠右端的位置上。那么要将该数据排序到正确的位置上，则所有的中间数据都需要向右移动一位。

### (三)、希尔排序的优点

- 希尔排序通过加大插入排序中元素之间的间隔，并对这些间隔的元素进行插入排序，从而使得数据可以大幅度的移动。当完成该间隔的排序后，希尔排序会减少数据的间隔再进行排序。依次进行下去。

### (四)、间隔的计算

- 间隔h的初始值为1，通过h=3*h+1来循环计算，直到该间隔大于数组的大小时停止。最大间隔为不大于数组大小的最大值。

### (五)、间隔的减少

- 可以通过公式h=(h-1)/3来计算。

### (六)、希尔排序代码实现

---

## 九、[快速排序](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH09)

### (一)、快速排序的思想

- 快速排序通过将一个数组划分为两个子数组，然后通过递归调用自身为每一个子数组进行快速排序来实现。

### (二)、如何进行划分

- 设定关键字，将比关键字小的数据放在一组，比关键字大的放在另外一组。

### (三)、如何自动设定关键字

- 设置数组最右端的数据为关键字。

### (四)、快速排序代码实现

---

## 十、[二叉树的基本概念](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH10)

### (一)、树

- 1、为什么需要使用树:
  - 有序数组插入数据项和删除数据项太慢。
  - 链表查找数据太慢。
  - 在树中能非常快速的查找数据项、插入数据项和删除数据项。

- 2、树的结构
- 3、路径

  - 顺着连接节点的边从一个节点到另一个节点，所经过的节点顺序排列称为路径。

- 4、根

  - 树最上面的节点成为根节点。一棵树只有一个根。而且从根到任何节点有且只有一条路径。

- 5、父节点

  - 每个节点都有一条边向上连接到另一个节点，这个节点就称为是下面这个节点的父节点。

- 6、子节点

  - 每个节点都有一条边向下连接到另一个节点，下面的就是该节点的子节点。

- 7、叶子节点

  - 没有子节点的节点称为叶子节点。

- 8、子树

  - 每个节点都可以作为一个子树的根，它和它所有的子节点，子节点的子节点组合在一起就是一个子树。

- 9、访问

  - 访问一个节点是为了在这个节点上执行一些操作，如查看节点的数据项。但是如果仅仅是经过一个节点，不认为是访问了这个节点。

- 10、层

  - 一个节点的层数是指从根开始到这个节点有多少代。

### (二)、二叉树

- 树的每个节点最多只能有两个子节点的书，称为二叉树。

---

## 十一、[二叉树的基本操作](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH11)

### (一)、插入节点

- 从根节点开始查找一个相应的节点，这个节点将成为新插入节点的父节点。当父节点找到后，通过判断新节点的值比父节点的值的大小来决定是连接到左子节点还是右子节点。

### (二)、查找节点

- 从根节点开始查找，如果查找的节点值比当前节点的值小，则继续查找其左子树，否则查找其右子树。

---

## 十二、[遍历二叉树](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH12)

### (一)、遍历树

- 遍历树是根据一个特定的顺序访问树的每一个节点，根据顺序的不同分为前序遍历、中序遍历和后序遍历三种。

### (二)、前序遍历

	1. 访问根节点
	2. 前序遍历左子树
	3. 前序遍历右子树

### (三)、中序遍历

	1. 中序遍历左子树
	2. 访问根节点
	3. 中序遍历右子树

### (四)、后序遍历

	1. 后序遍历左子树
	2. 后序遍历右子树
	3. 访问根节点

---

## 十三、[删除二叉树节点](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH13)

	删除节点是二叉树操作中最复杂的。在删除之前首先要查找要删的节点。找到节点后，这个要删
	除的节点可能会有三种情况需要考虑。
- 1.该节点是叶子节点，没有子节点：
  要删除叶节点，只需要改变该节点的父节点的引用值，将指向该节点的引用设置为null就可以了。

- 2.该节点有一个子节点：
  改变父节点的引用，将其直接指向要删除节点的子节点。

- 3.该节点有两个子节点：
  要删除有两个子节点的节点，就需要使用它的中序后继来替代该节点。

---

## 十四、[红黑树]()

### (一)、二叉树的问题

- 前面介绍了二叉树，普通的二叉树作为数据存储工具有很大的优势，可以快速的插入、删除和查找数据项。遗憾的是，这仅仅是相对于插入随机数据，如果插入的数据是有序的，速度就变得特别慢了。

### (二)、平衡树和非平衡树

- 插入随机的数据，平衡树。

- 插入有序的数据，非平衡树。

### (三)、红黑规则

	1. 每个节点不是红色的就是黑色的。
	2. 根总是黑色的。
	3. 如果节点是红色的，则它的子节点必须是黑色的。
	4. 从根节点到叶节点的每条路径，必须包含相同数目的黑色节点。

### (四)、纠正违规

	纠正违规，将不符合红黑规则的树纠正为红黑树。
- 改变节点的颜色。

- 执行旋转操作。

---

## 十五、[哈希表](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH15)

### (一)、什么是哈希表

- 哈希表是一种数据结构，它提供了快速的插入操作和查找操作。其基于数组来实现。

### (二)、哈希化

- 直接将关键字作为索引。

- 将单词转换成索引。

  - 将字母转换成ASCII码，然后进行相加

  - 幂的连乘

  - 压缩可选值

### (三)、压缩问题及解决办法

	压缩后仍然可能出现的问题冲突，不能保证每个单词都映射到数组的空白单元。

- 1.开放地址法

- 2.链地址法

---

## 十六、[开放地址法](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH16)

### (一)、什么是开放地址法

- 当冲突发生时，通过查找数组的一个空位，并将数据填入，而不再用哈希函数得到的数组下标，这个方法叫做开放地址法。

### (二)、数据的插入

### (三)、数据的查找

### (四)、数据的删除

---

## 十七、[链地址法](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH17)

### (一)、什么是链地址法

- 在哈希表每个单元中设置链表。某个数据项的关键字还是像通常一样映射到哈希表的单元中，而数据项本身插入到单元的链表中。

### (二)、数据的插入

### (三)、数据的查找

### (四)、数据的删除

---

## 十八、[图的基本概念](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH18)

### (一)、图

- 1、什么是图

`图是一种和树相像的数据结构，通常有一个固定的形状，这是由物理或抽象的问题来决定的。`

- 2.邻接

`如果两个顶点被同一条边连接，就称这两个顶点是邻接的。`

- 3.路径

`路径是从一个顶点到另一个顶点经过的边的序列。`

- 4.连通图和非连通图

`至少有一条路径可以连接所有的顶点，那么这个图就是连通图，否则就是非连通图。`

- 5.有向图和无向图

`有向图的边是有方向的，如只能从A到B，不能从B到A。`

`无向图的边是没有方向的，可以从A到B，也可以从B到A。`

- 6.带权图

`在有些图中，边被赋予了一个权值，权值是一个数字，它可以代表如两个顶点的物理距离，或者是一个顶点到另一个顶点的时间等等。这样的图叫做带权图。`

- 7、图的代码实现

---

## 十九、[图的搜索](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH19)

### (一)、图的搜索

- 图的搜索是指从一个指定顶点可以到达哪些顶点。

### (二)、搜索的分类

- 1.深度优先搜索DFS
- 2.广度优先搜索BFS

### (三)、深度优先搜索规则

	1. 如果可能，访问一个邻接的未访问过的顶点，标记它，并把它放入栈中。
	2. 当不能执行规则1时，如果栈不为空，就从栈中弹出一个顶点。
	3. 当不能执行规则1和规则2时，就完成了整个搜索过程。

### (四)、广度优先搜索规则

	1. 访问下一个邻接的未访问过的顶点，这个顶点必须是当前节点的邻接点，标记它，并把它插入到队列中。
	2. 如果无法执行规则1，那么就从队列头取出一个顶点，并使其作为当前顶点。
	3. 当队列为空不能执行规则2时，就完成了整个搜索过程。

---

## 二十、[图的最小生成树](https://github.com/MouseZhang/DataStructuresAndAlgorithm/tree/master/src/CH20)

### (一)、最小生成树

- 连接每个顶点最少的连线。最小生成树边的数量总是比顶点的数量少1。

### (二)、最小生成树代码实现

---


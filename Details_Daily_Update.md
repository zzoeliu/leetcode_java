Notes for everyday updates.
07/01/2015
--------------
  1.Environment setup
    github setup
        Download and install git following
        https://help.github.com/articles/set-up-git/
        Using https clone authentication

    Set github account acccount/password info in intellij preference-> version control-> github profiles.

    check out projects from cvs control-> github using https url clone.

    VCS->git ->commit file
    VCS-> git-> push

  2.How to use Markdown labels to edit readme.md
    https://github.com/dushibaiyu/DsbyLiteExample/blob/master/Markdown/study.md

  3.Design issues
    For Roman numbers:

    counting numbers：
    Consecutive numbers of the same number. We need to add up these same numbers to get our result.
    Smaller number on right side of bigger number. we need to add them to get our result.VIII = 8
    smaller number(I,X,C) on left side of larger number, we need to subtract small number from larger
    number to get our result.IV = 4
    same number will not be consecutive more than 3 times.
    a line on the number means 1000 times the original one(exclude from this problem, cause we just consider 1..3999)


    How to calculate(1..3999)
    traverse the roman, if the former is smaller, we need to add , othereise, we need to add this number and substract
    2 times the former one.

    LevelTraverse could use 2 queues to record current level nodes and values as well as the next level

    HashSet vs HashTable vs HashMap: differences,interfaces provided and different usage.

  4.Coding&debugging issues
       switch()
       {
            case 1 : ; break;
            case 2 : ; break;
            ..
            default: ;

       }

       use correct "public static void main(String[] args)" to get the run option with right click


       List is abstract interface . It has be implemented as ArrayList,stack,LinkedList,vector,stack

       ArrayList<List<Integer>> travList = new ArrayList<List<Integer>>();
       ArrayList<ArrayList<Integer>> is not a subset of List<List<Integer>>,instead ArrayList<List<Integer>> is.
  5.Problems
    Could not new class file in intellij. just right click to mark src directory as the source root.
    http://stackoverflow.com/questions/18852425/intellij-does-not-show-class-when-we-right-click-and-select-new

    Think about using just one queue to do binary tree level order traverse.

  6.Rules
    Java naming rules
    http://www.cnblogs.com/doit8791/archive/2012/05/24/2517233.html
        packages use lower case
        classes initiates with capital letters for each word, the same as interface
        methods use lower case
        variables initiates with lower case but capital letters as the initial letter for following words
        const use capital letters for all words
07/02/2015
--------------
   1.Coding&debugging issues
    Sometimes packages fail to be imported from another directory. You need to build the original class to module
    firstly, then do compilation and run.
   2.Knowledge
    String vs StringBuffer vs StringBuilder

07/04/2015
---------------
    Pre-order, in-order and post-order traversal are the three different kinds of depth first search that are possible.
    So it's not a question of whether to use DFS or one of those three. If you are using one of those three traversals,
    you are using DFS.

    As for whether there are cases where BFS is preferable over DFS: Yes, there are. For example to find the shortest
    path between two nodes in an unweighted graph, you can use BFS because the first path found by a BFS happens to be
    the one with the fewest edges. The same is not true for DFS.

    For List element remove, we need a listnode to track the nodes of list, pre.next=head, then we also need another
    node cur=pre to move forward,at last we need to return the new list pre.next.

    ReverseBits, ReverseInteger etc. you need to consider the numbers exceed MIN_VALUE and MAX_VALUE, use double to hold
    the original number then do a check and return proper result.

    HashMap traverse:(keyset traverse)
    Iterator<Integer> iter=container.keySet().iterator();
            while(iter.hasNext())
            {
                int key=iter.next();
                int value=container.get(key);
                }

07/05/2015
--------------------------
    java escape character \\.（165	Compare Version Numbers）
    n & (n-1) will turn off the rightmost bit of a integer. used to solve poweroftwo
    (see http://www.catonmat.net/blog/low-level-bit-hacks-you-absolutely-must-know/)??????

    minDepthOfTree,跟Maximum Depth of Binary Tree非常类似，只是这道题因为是判断最小深度，所以必须增加一个叶子的判断
    （因为如果一个节点如果只有左子树或者右子树，我们不能取它左右子树中小的作为深度，因为那样会是0，我们只有在叶子节点才能判断深度，
    而在求最大深度的时候，因为一定会取大的那个，所以不会有这个问题）。所以比Maximum Depth of Binary Tree多加一个左右子树的判断

07/06/2015
---------------------------
    For graph, we could also do BFS and DFS traverse(Course Schedule) to check circle.
    Course schedule BFS(Calculate the no pre course list),DFS caculate the courses list which follow certain course
    MaxArea problem, we need to decide the left line and right line at the same time. So we begin at point(0) and
    point(n-1),keep tracking the maxarea.It's the same as largest histogram problem
    Calculator needs stack.
07/07/2015
---------------------------
    Permutation problem, insert the nth number into the result of (n-1). It has n position to insert for each result
    of n-1.
07/08/2015
---------------------------
     Binary Seach Tree(Ordered tree) : all left nodes smaller than root smaller than right subtree.
     Boyer-Moore Majority Vote(https://leetcode.com/discuss/43248/boyer-moore-majority-vote-algorithm-and-my-elaboration):
     The core thought: if we want to find n/k majority number, it should be show up at least once in every k numbers.(we
     need to check the majority number twice, the first time is to pick up majority elements, the second time should check
     if they really show up more than n/k times )
     caculate all 1s in less than or equal to n(http://blog.csdn.net/xudli/article/details/46798619)
     (a + 8) / 10 * m + (a % 10 == 1) * (b + 1);

     Caculate nodes of complete binary tree:
     1) get the height of left-most part(note here we need to calculate including the root node)
     2) get the height of right-most part
     3) when they are equal, the # of nodes = 2^h -1
     4) when they are not equal, recursively get # of nodes from left&right sub-trees

     Collections.sort(http://blog.csdn.net/janronehoo/article/details/8746447
     https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html)
     We need to define a comparator before we use Collections.sort
     class IntervalComparator implements Comparator<Interval>
     	public int compare(Interval i1, Interval i2)
     	Classes Implementing Comparable
        Class	Natural Ordering
        Byte	Signed numerical
        Character	Unsigned numerical
        Long	Signed numerical
        Integer	Signed numerical
        Short	Signed numerical
        Double	Signed numerical
        Float	Signed numerical
        BigInteger	Signed numerical
        BigDecimal	Signed numerical
        Boolean	Boolean.FALSE < Boolean.TRUE
        File	System-dependent lexicographic on path name
        String	Lexicographic
        Date	Chronological
        CollationKey	Locale-specific lexicographic

07/10/2015
---------------------------
      k-sum problem(http://blog.csdn.net/whuwangyi/article/details/14104589)
      length of arraylist,hashset,hashmap,int[][],String
      preorder tree traverse : The key to solve this problem is using a stack(Stack<TreeNode> stack
      ) to store left and right children, and push right child first so that it is processed after the left child.
      Reverse list order(This problem can be solved by doing the following:

                         Break list in the middle to two lists (use fast & slow pointers)
                         Reverse the order of the second list
                         Merge two list back together)
                         http://www.programcreek.com/2013/12/in-place-reorder-a-singly-linked-list-in-java/

       After we divide list into two lists, we should use null to end up the first half list.
       How to decide the start point of a cycle list?
       We need two times traverse. The first time is to locate the meeting point. The second time we need to traverse from
       the meeting point and head seperately, at last the second meeting point is what we want.

07/11/2015
------------------------------
       6 Difference Between HashMap And HashTable : Popular Interview Question In Java With Example
       (http://javahungry.blogspot.com/2014/03/hashmap-vs-hashtable-difference-with-example-java-interview-questions.html)
       details usage of pair,hashmap,hashtable,hashset
       Arrays.sort()
       Collections.sort()

       Rotate Image(90 clockwise): rotate by diagnal,then by middle vertical line.


       Maximum Product Subarray
               int max_copy = max_local;
               max_local = Math.max(Math.max(nums[i]*max_local, nums[i]), nums[i]*min_local); //min_local considering negative number(nums[i] and min_local are both negative)
               min_local = Math.min(Math.min(nums[i]*max_copy, nums[i]), nums[i]*min_local);
               global = Math.max(global, max_local);
       vs Maximum Subarray(sum+=nums[i];
                                                                max=Math.max(max,sum);)


07/15/2015
------------------------------
    queue(LinkedList),stack,arraylist operations.

    Swap Nodes in Pairs . Need dummy node to record the head, cause we need to change head node. dummy.next=head
    two pointers, one is for the last node of last pair. Another pointer is for the first node of the current pair.

    trapping water & buy and sell stock(two transactions) DP to find left and right max elements for each item.
    triangle use bottom up methods.

07/16/2015
------------------------------
    N-queen, combination sum, use backtracking methods.
    String.valueOf vs Integer.toString()

07/18/2015
-------------------------------
    treeSet
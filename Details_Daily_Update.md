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


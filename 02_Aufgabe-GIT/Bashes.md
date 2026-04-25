Marvin@Major MINGW64 ~
$ cd d:

Marvin@Major MINGW64 /d
$ cd Studium

Marvin@Major MINGW64 /d/Studium
$ cd Semester 4
bash: cd: too many arguments

Marvin@Major MINGW64 /d/Studium
$ cd Semester4
bash: cd: Semester4: No such file or directory

Marvin@Major MINGW64 /d/Studium
$ cd Semester\ 4

Marvin@Major MINGW64 /d/Studium/Semester 4
$ cd Softwaretechnik

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik
$ cd Repo

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo
$ git clone https://github.com/Marvin-BHT/Softwaretechnik_MBock
Cloning into 'Softwaretechnik_MBock'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (3/3), done.

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo
$ cd Softwaretechnick_MBock
bash: cd: Softwaretechnick_MBock: No such file or directory

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo
$ cd Softwaretechnik_MBock

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        "01_Aufgabe-Einf\303\274hrung/"

nothing added to commit but untracked files present (use "git add" to track)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock (main)
$ git add .

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock (main)
$ git commit -m "Aufgabe-Einführung hinzugefügt"
[main 9eb1255] Aufgabe-Einführung hinzugefügt
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 "01_Aufgabe-Einf\303\274hrung/SWT-E1-MarvinBock.pdf"

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock (main)
$ git push
info: please complete authentication in your browser...
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 16 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (4/4), 289.29 KiB | 41.33 MiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Marvin-BHT/Softwaretechnik_MBock
   11259d3..9eb1255  main -> main

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock (main)
$ cd 02_Aufgabe-GIT

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock/02_Aufgabe-GIT (main)
$ echo "Test GIT Aufgabe ECHO" >> GIT-Test.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock/02_Aufgabe-GIT (main)
$ git diff

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/Repo/Softwaretechnik_MBock/02_Aufgabe-GIT (main)
$ cd

Marvin@Major MINGW64 ~
$ nano ~/.bashrc

Marvin@Major MINGW64 ~
$ source ~/.bashrc

Marvin@Major MINGW64 ~
$ swt
bash: swt: command not found

Marvin@Major MINGW64 ~
$ SWT

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ git diff

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        02_Aufgabe-GIT/

nothing added to commit but untracked files present (use "git add" to track)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ ^C

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ git add 02_Aufgabe-GIT/
warning: in the working copy of '02_Aufgabe-GIT/GIT-Test.md', LF will be replaced by CRLF the next time Git touches it

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ git diff --staged
diff --git a/02_Aufgabe-GIT/GIT-Test.md b/02_Aufgabe-GIT/GIT-Test.md
new file mode 100644
index 0000000..dbe3604
--- /dev/null
+++ b/02_Aufgabe-GIT/GIT-Test.md
@@ -0,0 +1 @@
+Test GIT Aufgabe ECHO

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ git commit -m "Datei im Ordner hinzugefügt und bearbeitet"
[main 452ebb7] Datei im Ordner hinzugefügt und bearbeitet
 1 file changed, 1 insertion(+)
 create mode 100644 02_Aufgabe-GIT/GIT-Test.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 16 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 423 bytes | 423.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Marvin-BHT/Softwaretechnik_MBock
   9eb1255..452ebb7  main -> main

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock (main)
$ cd 02_Aufgabe-Git

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ echo "Test > löschen.md
> Hallo
> ^C

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ echo "Test" > löschen.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git add löschen.md
warning: in the working copy of '02_Aufgabe-GIT/löschen.md', LF will be replaced by CRLF the next time Git touches it

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git commit -m "Testdatei erstellt"
[main 1105b71] Testdatei erstellt
 1 file changed, 1 insertion(+)
 create mode 100644 "02_Aufgabe-GIT/l\303\266schen.md"

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git rm löschen.md
rm '02_Aufgabe-GIT/löschen.md'

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git commit -m  "Datei löschen.md gelöscht"
[main db988ac] Datei löschen.md gelöscht
 1 file changed, 1 deletion(-)
 delete mode 100644 "02_Aufgabe-GIT/l\303\266schen.md"

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git mv GIT-Test.md GIT-Neu.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git commit -m "Datei umbenannt"
[main 81b9094] Datei umbenannt
 1 file changed, 0 insertions(+), 0 deletions(-)
 rename 02_Aufgabe-GIT/{GIT-Test.md => GIT-Neu.md} (100%)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git log
commit 81b9094fe8f0f7ba8f61af71507992b3885c9f42 (HEAD -> main)
Author: Marvin <mabo3343@bht-berlin.de>
Date:   Sat Apr 25 09:15:04 2026 +0200

    Datei umbenannt

commit db988ac82ffd4bbaf4d883437abf4d9e17edaef9
Author: Marvin <mabo3343@bht-berlin.de>
Date:   Sat Apr 25 09:13:52 2026 +0200

    Datei löschen.md gelöscht

commit 1105b719b315c8be70ff2f0ca27aa8186962ac60
Author: Marvin <mabo3343@bht-berlin.de>
Date:   Sat Apr 25 09:11:11 2026 +0200

    Testdatei erstellt

commit 452ebb730db2fdcdf2b02c28afb1b2c51581bb40 (origin/main, origin/HEAD)
Author: Marvin <mabo3343@bht-berlin.de>
Date:   Sat Apr 25 09:07:05 2026 +0200

    Datei im Ordner hinzugefügt und bearbeitet

commit 9eb1255bc38d3258d9660d6b63b70b00f836f976
Author: Marvin <mabo3343@bht-berlin.de>
Date:   Sat Apr 25 08:47:10 2026 +0200

    Aufgabe-Einführung hinzugefügt

commit 11259d39c8ce3487c649b87432b2ce3f1914a695
Author: Marvin-BHT <mabo3343@bht-berlin.de>
Date:   Sat Apr 25 08:38:26 2026 +0200

    Initial commit

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git checkout db988ac82ffd4bbaf4d883437abf4d9e17edaef9
Note: switching to 'db988ac82ffd4bbaf4d883437abf4d9e17edaef9'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at db988ac Datei löschen.md gelöscht

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git ((db988ac...))
$ git checkout main
Previous HEAD position was db988ac Datei löschen.md gelöscht
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 3 commits.
  (use "git push" to publish your local commits)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git checkout -b feature1
Switched to a new branch 'feature1'

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ echo "Feature 1 Änderung" >> GIT-Feature1.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ git add GIT-Feature1.md
warning: in the working copy of '02_Aufgabe-GIT/GIT-Feature1.md', LF will be replaced by CRLF the next time Git touches it

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ git commit -m "Änderung in feature1"
[feature1 d5df64a] Änderung in feature1
 1 file changed, 1 insertion(+)
 create mode 100644 02_Aufgabe-GIT/GIT-Feature1.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ git checkout main
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 3 commits.
  (use "git push" to publish your local commits)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git checkout -b feature2
Switched to a new branch 'feature2'

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature2)
$ echo "Feature 2 Änderung" >> GIT-Neu.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature2)
$ git add GIT-Neu.md
warning: in the working copy of '02_Aufgabe-GIT/GIT-Neu.md', LF will be replaced by CRLF the next time Git touches it

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature2)
$ git commit -m "Änderung in feature2"
[feature2 a131b2c] Änderung in feature2
 1 file changed, 1 insertion(+)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature2)
$ git checkout main
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 3 commits.
  (use "git push" to publish your local commits)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git merge feature 1
merge: feature - not something we can merge

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git merge feature 2
merge: feature - not something we can merge

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git branch -D feature1
Deleted branch feature1 (was d5df64a).

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git checkout -b feature1
Switched to a new branch 'feature1'

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ echo "Feature 1 Änderung" >> GIT-Neu.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ git add GIT-Neu.md
warning: in the working copy of '02_Aufgabe-GIT/GIT-Neu.md', LF will be replaced by CRLF the next time Git touches it

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ git commit -m "Feature 1 korrekt geändert"
[feature1 daa3ea2] Feature 1 korrekt geändert
 1 file changed, 1 insertion(+)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (feature1)
$ git checkout main
Switched to branch 'main'
Your branch is ahead of 'origin/main' by 3 commits.
  (use "git push" to publish your local commits)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git merge feature1
Updating 81b9094..daa3ea2
Fast-forward
 02_Aufgabe-GIT/GIT-Neu.md | 1 +
 1 file changed, 1 insertion(+)

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git merge feature2
Auto-merging 02_Aufgabe-GIT/GIT-Neu.md
CONFLICT (content): Merge conflict in 02_Aufgabe-GIT/GIT-Neu.md
Automatic merge failed; fix conflicts and then commit the result.

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main|MERGING)
$ git add GIT-Neu.md

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main|MERGING)
$ git commit -m "Merge konflikt behoben"
[main f0475ba] Merge konflikt behoben

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git push origin main
Enumerating objects: 22, done.
Counting objects: 100% (22/22), done.
Delta compression using up to 16 threads
Compressing objects: 100% (13/13), done.
Writing objects: 100% (20/20), 2.01 KiB | 1.01 MiB/s, done.
Total 20 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/Marvin-BHT/Softwaretechnik_MBock
   452ebb7..f0475ba  main -> main

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git push origin feature1
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'feature1' on GitHub by visiting:
remote:      https://github.com/Marvin-BHT/Softwaretechnik_MBock/pull/new/feature1
remote:
To https://github.com/Marvin-BHT/Softwaretechnik_MBock
 * [new branch]      feature1 -> feature1

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$ git push origin feature2
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'feature2' on GitHub by visiting:
remote:      https://github.com/Marvin-BHT/Softwaretechnik_MBock/pull/new/feature2
remote:
To https://github.com/Marvin-BHT/Softwaretechnik_MBock
 * [new branch]      feature2 -> feature2

Marvin@Major MINGW64 /d/Studium/Semester 4/Softwaretechnik/REPO/Softwaretechnik_MBock/02_Aufgabe-Git (main)
$

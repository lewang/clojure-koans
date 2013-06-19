(meditations
  "Lists can be expressed by function or a quoted form"
  (= '(1 2 3 4 5) (list 1 2 3 4 5))
        ;;; ⇒ true

  "They are Clojure seqs (sequences), so they allow access to the first"
  (= 1 (first '(1 2 3 4 5)))
        ;;; ⇒ true

  "As well as the rest"
  (= '(2 3 4 5) (rest '(1 2 3 4 5)))
        ;;; ⇒ true

  "Count your blessings"
  (= 3 (count '(dracula dooku chocula)))
        ;;; ⇒ true

  "Before they are gone"
  (= 0 (count '()))
        ;;; ⇒ true

  "The rest, when nothing is left, is empty"
  (= '() (rest '(100)))
        ;;; ⇒ true

  "Construction by adding an element to the front is easy"
  (= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))
        ;;; ⇒ true

  "Conjoining an element to a list isn't hard either"
  (= '(:e :a :b :c :d) (conj '(:a :b :c :d) :e))
        ;;; ⇒ true

  "You can use a list like a stack to get the first element"
  (= :a (peek '(:a :b :c :d :e)))
        ;;; ⇒ true

  "Or the others"
  (= '(:b :c :d :e) (pop '(:a :b :c :d :e)))
        ;;; ⇒ true

  "But watch out if you try to pop nothing"
  (= "No dice!" (try
          (pop '())
          (catch IllegalStateException e
            "No dice!")))
        ;;; ⇒ true

  "The rest of nothing isn't so strict"
  (= '() (try
           (rest '())
           (catch IllegalStateException e
             "No dice!")))
        ;;; ⇒ true

  )

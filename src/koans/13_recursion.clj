(defn is-even? [n]
  (if (= n 0)
    true
    (not (is-even? (dec n)))))

(defn is-even-bigint? [n]
  (loop [n   n
         acc true]
    (if (= n 0)
      accum
      (recur (dec n) (not acc)))))

(defn recursive-reverse [coll]
  (loop [[first & rest] coll
         result ()]
    (if-not first
      result
      (recur rest (cons first result)))))

(defn factorial [n]
  (loop [n n
         product 1]
    (if (< n 1 )
      product
      (recur (dec n) (* product n)))))

(meditations
  "Recursion ends with a base case"
  (= true (is-even? 0))
        ;;; ⇒ true

  "And starts by moving toward that base case"
  (= false (is-even? 1))
        ;;; ⇒ true

  "Having too many stack frames requires explicit tail calls with recur"
  (= false (is-even-bigint? 100003N))
        ;;; ⇒ false

  "Reversing directions is easy when you have not gone far"
  (= '(1) (recursive-reverse [1]))
        ;;; ⇒ true

  "Yet more difficult the more steps you take"
  (= '(5 4 3 2 1) (recursive-reverse [1 2 3 4 5]))
        ;;; ⇒ true

  "Simple things may appear simple."
  (= 1 (factorial 1))
        ;;; ⇒ true

  "They may require other simple steps."
  (= 2 (factorial 2))
        ;;; ⇒ true

  "Sometimes a slightly bigger step is necessary"
  (= 6 (factorial 3))
        ;;; ⇒ true

  "And eventually you must think harder"
  (= 24 (factorial 4))
        ;;; ⇒ true

  "You can even deal with very large numbers"
  (< 1000000000000000000000000N (factorial 1000N))
        ;;; ⇒ true

  "But what happens when the machine limits you?"
  (< 1000000000000000000000000N (factorial 100003N))
        ;;; ⇒ true

  )

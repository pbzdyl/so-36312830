(ns so-36312830.core)

(defprotocol IPrintable
  (prnt [this]))

(extend-protocol IPrintable
  clojure.lang.Associative
  (prnt [this] (str "clojure.lang.Associative " this)))

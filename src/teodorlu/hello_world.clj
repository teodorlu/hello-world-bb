(ns teodorlu.hello-world
  (:require
   [babashka.cli :as cli]))

(defn -main [& args]
  (let [opts (cli/parse-opts args)
        name (or (:name opts) "World")]
    (println (str "Hello, " name "!"))))

(defproject drunk-uncle "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [edu.stanford.nlp/stanford-corenlp "3.5.2"]
                 [edu.stanford.nlp/stanford-corenlp "3.5.2" :classifier "models"]
                 [edu.stanford.nlp/stanford-corenlp "3.5.2" :classifier "sources"]
                 [edu.stanford.nlp/stanford-corenlp "3.5.2" :classifier "javadoc"]
                 ]
  :main ^:skip-aot drunk-uncle.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

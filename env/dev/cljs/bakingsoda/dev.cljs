(ns ^:figwheel-no-load bakingsoda.dev
  (:require [bakingsoda.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

(enable-console-print!)

(core/init!)

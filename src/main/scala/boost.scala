package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


case object boost extends Bundle() {

  def install: Results = {
    Seq("yum", "install", "-y", "boost") ->-
    success(s"${bundleName} is installed")
  }

}

# Play Native Loader

This is a very small library that makes it possible to use native libraries with Play. Since Play uses its own class loader for `run` command, we need an external library that loads the native libraries in the same class loader that is used by the classes.

## Installation

To use it, please add the following dependency to your project's `build.sbt` or `project/Build.scala` file:

```scala
"com.typesafe.play" %% "play-native-loader" % "1.0.0"
```

## License

License

Copyright (C) 2009-2017 Lightbend Inc. (https://www.lightbend.com).

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

## Support

The play-native-loader library is *[Community Driven][]*.

[Community Driven]: https://developer.lightbend.com/docs/reactive-platform/2.0/support-terminology/index.html#community-driven

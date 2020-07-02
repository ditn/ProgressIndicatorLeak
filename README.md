* Start app, see `ProgressIndicator`
* Click `Close Activity` button
* Wait a few seconds
* See notification from LeakCanary, "3 retained objects, tap to dump heap"
* Click to dump
* See notication, "Found 1 retained object grouped as 1 distinct leak"
* See leak + heap dump.

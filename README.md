# ExampleRoomCoroutine
Android App Room-Coroutine example

Try access to Sqlite's meta data through `sqlite_master` table.
Because Room cannot recognize this table, use `query` method directly. It seems not a good implementation. (see MetaDao.kt)

Use these libraries.

- Room
- Coroutine
- Dagger
- Dagger-Android

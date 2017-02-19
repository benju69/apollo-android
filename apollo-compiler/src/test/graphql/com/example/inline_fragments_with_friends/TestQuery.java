package com.example.inline_fragments_with_friends;

import com.apollographql.android.api.graphql.Field;
import com.apollographql.android.api.graphql.Operation;
import com.apollographql.android.api.graphql.Query;
import com.apollographql.android.api.graphql.ResponseFieldMapper;
import com.apollographql.android.api.graphql.ResponseReader;
import com.example.inline_fragments_with_friends.type.Episode;
import java.io.IOException;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class TestQuery implements Query<Operation.Variables> {
  public static final String OPERATION_DEFINITION = "query TestQuery {\n"
      + "  hero {\n"
      + "    __typename\n"
      + "    name\n"
      + "  ... on Human {\n"
      + "      height\n"
      + "      friends {\n"
      + "        __typename\n"
      + "        appearsIn\n"
      + "      }\n"
      + "    }\n"
      + "    ... on Droid {\n"
      + "      primaryFunction\n"
      + "      friends {\n"
      + "        __typename\n"
      + "        id\n"
      + "      }\n"
      + "    }\n"
      + "  }\n"
      + "}";

  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION;

  private final Operation.Variables variables;

  public TestQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  public static class Data implements Operation.Data {
    public static final Creator CREATOR = new Creator() {
      @Override
      public @Nonnull Data create(@Nullable Hero hero) {
        return new Data(hero);
      }
    };

    public static final Factory FACTORY = new Factory() {
      @Override
      public @Nonnull Creator creator() {
        return CREATOR;
      }

      @Override
      public @Nonnull Hero.Factory heroFactory() {
        return Hero.FACTORY;
      }
    };

    private final @Nullable Hero hero;

    public Data(@Nullable Hero hero) {
      this.hero = hero;
    }

    public @Nullable Hero hero() {
      return this.hero;
    }

    @Override
    public String toString() {
      return "Data{"
        + "hero=" + hero
        + "}";
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return ((this.hero == null) ? (that.hero == null) : this.hero.equals(that.hero));
      }
      return false;
    }

    @Override
    public int hashCode() {
      int h = 1;
      h *= 1000003;
      h ^= (hero == null) ? 0 : hero.hashCode();
      return h;
    }

    public static class Hero {
      public static final Creator CREATOR = new Creator() {
        @Override
        public @Nonnull Hero create(@Nonnull String name, @Nullable AsHuman asHuman,
            @Nullable AsDroid asDroid) {
          return new Hero(name, asHuman, asDroid);
        }
      };

      public static final Factory FACTORY = new Factory() {
        @Override
        public @Nonnull Creator creator() {
          return CREATOR;
        }

        @Override
        public @Nonnull AsHuman.Factory asHumanFactory() {
          return AsHuman.FACTORY;
        }

        @Override
        public @Nonnull AsDroid.Factory asDroidFactory() {
          return AsDroid.FACTORY;
        }
      };

      private final @Nonnull String name;

      private @Nullable AsHuman asHuman;

      private @Nullable AsDroid asDroid;

      public Hero(@Nonnull String name, @Nullable AsHuman asHuman, @Nullable AsDroid asDroid) {
        this.name = name;
        this.asHuman = asHuman;
        this.asDroid = asDroid;
      }

      public @Nonnull String name() {
        return this.name;
      }

      public @Nullable AsHuman asHuman() {
        return this.asHuman;
      }

      public @Nullable AsDroid asDroid() {
        return this.asDroid;
      }

      @Override
      public String toString() {
        return "Hero{"
          + "name=" + name + ", "
          + "asHuman=" + asHuman + ", "
          + "asDroid=" + asDroid
          + "}";
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (o instanceof Hero) {
          Hero that = (Hero) o;
          return ((this.name == null) ? (that.name == null) : this.name.equals(that.name))
           && ((this.asHuman == null) ? (that.asHuman == null) : this.asHuman.equals(that.asHuman))
           && ((this.asDroid == null) ? (that.asDroid == null) : this.asDroid.equals(that.asDroid));
        }
        return false;
      }

      @Override
      public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= (name == null) ? 0 : name.hashCode();
        h *= 1000003;
        h ^= (asHuman == null) ? 0 : asHuman.hashCode();
        h *= 1000003;
        h ^= (asDroid == null) ? 0 : asDroid.hashCode();
        return h;
      }

      public static class AsHuman {
        public static final Creator CREATOR = new Creator() {
          @Override
          public @Nonnull AsHuman create(@Nonnull String name, @Nullable List<Friend> friends,
              @Nullable Double height) {
            return new AsHuman(name, friends, height);
          }
        };

        public static final Factory FACTORY = new Factory() {
          @Override
          public @Nonnull Creator creator() {
            return CREATOR;
          }

          @Override
          public @Nonnull Friend.Factory friendFactory() {
            return Friend.FACTORY;
          }
        };

        private final @Nonnull String name;

        private final @Nullable List<Friend> friends;

        private final @Nullable Double height;

        public AsHuman(@Nonnull String name, @Nullable List<Friend> friends,
            @Nullable Double height) {
          this.name = name;
          this.friends = friends;
          this.height = height;
        }

        public @Nonnull String name() {
          return this.name;
        }

        public @Nullable List<Friend> friends() {
          return this.friends;
        }

        public @Nullable Double height() {
          return this.height;
        }

        @Override
        public String toString() {
          return "AsHuman{"
            + "name=" + name + ", "
            + "friends=" + friends + ", "
            + "height=" + height
            + "}";
        }

        @Override
        public boolean equals(Object o) {
          if (o == this) {
            return true;
          }
          if (o instanceof AsHuman) {
            AsHuman that = (AsHuman) o;
            return ((this.name == null) ? (that.name == null) : this.name.equals(that.name))
             && ((this.friends == null) ? (that.friends == null) : this.friends.equals(that.friends))
             && ((this.height == null) ? (that.height == null) : this.height.equals(that.height));
          }
          return false;
        }

        @Override
        public int hashCode() {
          int h = 1;
          h *= 1000003;
          h ^= (name == null) ? 0 : name.hashCode();
          h *= 1000003;
          h ^= (friends == null) ? 0 : friends.hashCode();
          h *= 1000003;
          h ^= (height == null) ? 0 : height.hashCode();
          return h;
        }

        public static class Friend {
          public static final Creator CREATOR = new Creator() {
            @Override
            public @Nonnull Friend create(@Nonnull String name, @Nonnull List<Episode> appearsIn) {
              return new Friend(name, appearsIn);
            }
          };

          public static final Factory FACTORY = new Factory() {
            @Override
            public @Nonnull Creator creator() {
              return CREATOR;
            }
          };

          private final @Nonnull String name;

          private final @Nonnull List<Episode> appearsIn;

          public Friend(@Nonnull String name, @Nonnull List<Episode> appearsIn) {
            this.name = name;
            this.appearsIn = appearsIn;
          }

          public @Nonnull String name() {
            return this.name;
          }

          public @Nonnull List<Episode> appearsIn() {
            return this.appearsIn;
          }

          @Override
          public String toString() {
            return "Friend{"
              + "name=" + name + ", "
              + "appearsIn=" + appearsIn
              + "}";
          }

          @Override
          public boolean equals(Object o) {
            if (o == this) {
              return true;
            }
            if (o instanceof Friend) {
              Friend that = (Friend) o;
              return ((this.name == null) ? (that.name == null) : this.name.equals(that.name))
               && ((this.appearsIn == null) ? (that.appearsIn == null) : this.appearsIn.equals(that.appearsIn));
            }
            return false;
          }

          @Override
          public int hashCode() {
            int h = 1;
            h *= 1000003;
            h ^= (name == null) ? 0 : name.hashCode();
            h *= 1000003;
            h ^= (appearsIn == null) ? 0 : appearsIn.hashCode();
            return h;
          }

          public static final class Mapper implements ResponseFieldMapper<Friend> {
            final Factory factory;

            final Field[] fields = {
              Field.forString("name", "name", null, false),
              Field.forList("appearsIn", "appearsIn", null, false, new Field.ListReader<Episode>() {
                @Override public Episode read(final Field.ListItemReader reader) throws IOException {
                  return Episode.valueOf(reader.readString());
                }
              })
            };

            public Mapper(@Nonnull Factory factory) {
              this.factory = factory;
            }

            @Override
            public Friend map(ResponseReader reader) throws IOException {
              final __ContentValues contentValues = new __ContentValues();
              reader.read(new ResponseReader.ValueHandler() {
                @Override
                public void handle(final int fieldIndex, final Object value) throws IOException {
                  switch (fieldIndex) {
                    case 0: {
                      contentValues.name = (String) value;
                      break;
                    }
                    case 1: {
                      contentValues.appearsIn = (List<Episode>) value;
                      break;
                    }
                  }
                }
              }, fields);
              return factory.creator().create(contentValues.name, contentValues.appearsIn);
            }

            static final class __ContentValues {
              String name;

              List<Episode> appearsIn;
            }
          }

          public interface Factory {
            @Nonnull Creator creator();
          }

          public interface Creator {
            @Nonnull Friend create(@Nonnull String name, @Nonnull List<Episode> appearsIn);
          }
        }

        public static final class Mapper implements ResponseFieldMapper<AsHuman> {
          final Factory factory;

          final Field[] fields = {
            Field.forString("name", "name", null, false),
            Field.forList("friends", "friends", null, true, new Field.ObjectReader<Friend>() {
              @Override public Friend read(final ResponseReader reader) throws IOException {
                return new Friend.Mapper(factory.friendFactory()).map(reader);
              }
            }),
            Field.forDouble("height", "height", null, true)
          };

          public Mapper(@Nonnull Factory factory) {
            this.factory = factory;
          }

          @Override
          public AsHuman map(ResponseReader reader) throws IOException {
            final __ContentValues contentValues = new __ContentValues();
            reader.read(new ResponseReader.ValueHandler() {
              @Override
              public void handle(final int fieldIndex, final Object value) throws IOException {
                switch (fieldIndex) {
                  case 0: {
                    contentValues.name = (String) value;
                    break;
                  }
                  case 1: {
                    contentValues.friends = (List<Friend>) value;
                    break;
                  }
                  case 2: {
                    contentValues.height = (Double) value;
                    break;
                  }
                }
              }
            }, fields);
            return factory.creator().create(contentValues.name, contentValues.friends, contentValues.height);
          }

          static final class __ContentValues {
            String name;

            List<Friend> friends;

            Double height;
          }
        }

        public interface Factory {
          @Nonnull Creator creator();

          @Nonnull Friend.Factory friendFactory();
        }

        public interface Creator {
          @Nonnull AsHuman create(@Nonnull String name, @Nullable List<Friend> friends,
              @Nullable Double height);
        }
      }

      public static class AsDroid {
        public static final Creator CREATOR = new Creator() {
          @Override
          public @Nonnull AsDroid create(@Nonnull String name, @Nullable List<Friend> friends,
              @Nullable String primaryFunction) {
            return new AsDroid(name, friends, primaryFunction);
          }
        };

        public static final Factory FACTORY = new Factory() {
          @Override
          public @Nonnull Creator creator() {
            return CREATOR;
          }

          @Override
          public @Nonnull Friend.Factory friendFactory() {
            return Friend.FACTORY;
          }
        };

        private final @Nonnull String name;

        private final @Nullable List<Friend> friends;

        private final @Nullable String primaryFunction;

        public AsDroid(@Nonnull String name, @Nullable List<Friend> friends,
            @Nullable String primaryFunction) {
          this.name = name;
          this.friends = friends;
          this.primaryFunction = primaryFunction;
        }

        public @Nonnull String name() {
          return this.name;
        }

        public @Nullable List<Friend> friends() {
          return this.friends;
        }

        public @Nullable String primaryFunction() {
          return this.primaryFunction;
        }

        @Override
        public String toString() {
          return "AsDroid{"
            + "name=" + name + ", "
            + "friends=" + friends + ", "
            + "primaryFunction=" + primaryFunction
            + "}";
        }

        @Override
        public boolean equals(Object o) {
          if (o == this) {
            return true;
          }
          if (o instanceof AsDroid) {
            AsDroid that = (AsDroid) o;
            return ((this.name == null) ? (that.name == null) : this.name.equals(that.name))
             && ((this.friends == null) ? (that.friends == null) : this.friends.equals(that.friends))
             && ((this.primaryFunction == null) ? (that.primaryFunction == null) : this.primaryFunction.equals(that.primaryFunction));
          }
          return false;
        }

        @Override
        public int hashCode() {
          int h = 1;
          h *= 1000003;
          h ^= (name == null) ? 0 : name.hashCode();
          h *= 1000003;
          h ^= (friends == null) ? 0 : friends.hashCode();
          h *= 1000003;
          h ^= (primaryFunction == null) ? 0 : primaryFunction.hashCode();
          return h;
        }

        public static class Friend {
          public static final Creator CREATOR = new Creator() {
            @Override
            public @Nonnull Friend create(@Nonnull String name, @Nonnull String id) {
              return new Friend(name, id);
            }
          };

          public static final Factory FACTORY = new Factory() {
            @Override
            public @Nonnull Creator creator() {
              return CREATOR;
            }
          };

          private final @Nonnull String name;

          private final @Nonnull String id;

          public Friend(@Nonnull String name, @Nonnull String id) {
            this.name = name;
            this.id = id;
          }

          public @Nonnull String name() {
            return this.name;
          }

          public @Nonnull String id() {
            return this.id;
          }

          @Override
          public String toString() {
            return "Friend{"
              + "name=" + name + ", "
              + "id=" + id
              + "}";
          }

          @Override
          public boolean equals(Object o) {
            if (o == this) {
              return true;
            }
            if (o instanceof Friend) {
              Friend that = (Friend) o;
              return ((this.name == null) ? (that.name == null) : this.name.equals(that.name))
               && ((this.id == null) ? (that.id == null) : this.id.equals(that.id));
            }
            return false;
          }

          @Override
          public int hashCode() {
            int h = 1;
            h *= 1000003;
            h ^= (name == null) ? 0 : name.hashCode();
            h *= 1000003;
            h ^= (id == null) ? 0 : id.hashCode();
            return h;
          }

          public static final class Mapper implements ResponseFieldMapper<Friend> {
            final Factory factory;

            final Field[] fields = {
              Field.forString("name", "name", null, false),
              Field.forString("id", "id", null, false)
            };

            public Mapper(@Nonnull Factory factory) {
              this.factory = factory;
            }

            @Override
            public Friend map(ResponseReader reader) throws IOException {
              final __ContentValues contentValues = new __ContentValues();
              reader.read(new ResponseReader.ValueHandler() {
                @Override
                public void handle(final int fieldIndex, final Object value) throws IOException {
                  switch (fieldIndex) {
                    case 0: {
                      contentValues.name = (String) value;
                      break;
                    }
                    case 1: {
                      contentValues.id = (String) value;
                      break;
                    }
                  }
                }
              }, fields);
              return factory.creator().create(contentValues.name, contentValues.id);
            }

            static final class __ContentValues {
              String name;

              String id;
            }
          }

          public interface Factory {
            @Nonnull Creator creator();
          }

          public interface Creator {
            @Nonnull Friend create(@Nonnull String name, @Nonnull String id);
          }
        }

        public static final class Mapper implements ResponseFieldMapper<AsDroid> {
          final Factory factory;

          final Field[] fields = {
            Field.forString("name", "name", null, false),
            Field.forList("friends", "friends", null, true, new Field.ObjectReader<Friend>() {
              @Override public Friend read(final ResponseReader reader) throws IOException {
                return new Friend.Mapper(factory.friendFactory()).map(reader);
              }
            }),
            Field.forString("primaryFunction", "primaryFunction", null, true)
          };

          public Mapper(@Nonnull Factory factory) {
            this.factory = factory;
          }

          @Override
          public AsDroid map(ResponseReader reader) throws IOException {
            final __ContentValues contentValues = new __ContentValues();
            reader.read(new ResponseReader.ValueHandler() {
              @Override
              public void handle(final int fieldIndex, final Object value) throws IOException {
                switch (fieldIndex) {
                  case 0: {
                    contentValues.name = (String) value;
                    break;
                  }
                  case 1: {
                    contentValues.friends = (List<Friend>) value;
                    break;
                  }
                  case 2: {
                    contentValues.primaryFunction = (String) value;
                    break;
                  }
                }
              }
            }, fields);
            return factory.creator().create(contentValues.name, contentValues.friends, contentValues.primaryFunction);
          }

          static final class __ContentValues {
            String name;

            List<Friend> friends;

            String primaryFunction;
          }
        }

        public interface Factory {
          @Nonnull Creator creator();

          @Nonnull Friend.Factory friendFactory();
        }

        public interface Creator {
          @Nonnull AsDroid create(@Nonnull String name, @Nullable List<Friend> friends,
              @Nullable String primaryFunction);
        }
      }

      public static final class Mapper implements ResponseFieldMapper<Hero> {
        final Factory factory;

        final Field[] fields = {
          Field.forString("name", "name", null, false),
          Field.forConditionalType("__typename", "__typename", new Field.ConditionalTypeReader<AsHuman>() {
            @Override
            public AsHuman read(String conditionalType, ResponseReader reader) throws IOException {
              if (conditionalType.equals("Human")) {
                return new AsHuman.Mapper(factory.asHumanFactory()).map(reader);
              } else {
                return null;
              }
            }
          }),
          Field.forConditionalType("__typename", "__typename", new Field.ConditionalTypeReader<AsDroid>() {
            @Override
            public AsDroid read(String conditionalType, ResponseReader reader) throws IOException {
              if (conditionalType.equals("Droid")) {
                return new AsDroid.Mapper(factory.asDroidFactory()).map(reader);
              } else {
                return null;
              }
            }
          })
        };

        public Mapper(@Nonnull Factory factory) {
          this.factory = factory;
        }

        @Override
        public Hero map(ResponseReader reader) throws IOException {
          final __ContentValues contentValues = new __ContentValues();
          reader.toBufferedReader().read(new ResponseReader.ValueHandler() {
            @Override
            public void handle(final int fieldIndex, final Object value) throws IOException {
              switch (fieldIndex) {
                case 0: {
                  contentValues.name = (String) value;
                  break;
                }
                case 1: {
                  contentValues.asHuman = (AsHuman) value;
                  break;
                }
                case 2: {
                  contentValues.asDroid = (AsDroid) value;
                  break;
                }
              }
            }
          }, fields);
          return factory.creator().create(contentValues.name, contentValues.asHuman, contentValues.asDroid);
        }

        static final class __ContentValues {
          String name;

          AsHuman asHuman;

          AsDroid asDroid;
        }
      }

      public interface Factory {
        @Nonnull Creator creator();

        @Nonnull AsHuman.Factory asHumanFactory();

        @Nonnull AsDroid.Factory asDroidFactory();
      }

      public interface Creator {
        @Nonnull Hero create(@Nonnull String name, @Nullable AsHuman asHuman,
            @Nullable AsDroid asDroid);
      }
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final Factory factory;

      final Field[] fields = {
        Field.forObject("hero", "hero", null, true, new Field.ObjectReader<Hero>() {
          @Override public Hero read(final ResponseReader reader) throws IOException {
            return new Hero.Mapper(factory.heroFactory()).map(reader);
          }
        })
      };

      public Mapper(@Nonnull Factory factory) {
        this.factory = factory;
      }

      @Override
      public Data map(ResponseReader reader) throws IOException {
        final __ContentValues contentValues = new __ContentValues();
        reader.read(new ResponseReader.ValueHandler() {
          @Override
          public void handle(final int fieldIndex, final Object value) throws IOException {
            switch (fieldIndex) {
              case 0: {
                contentValues.hero = (Hero) value;
                break;
              }
            }
          }
        }, fields);
        return factory.creator().create(contentValues.hero);
      }

      static final class __ContentValues {
        Hero hero;
      }
    }

    public interface Factory {
      @Nonnull Creator creator();

      @Nonnull Hero.Factory heroFactory();
    }

    public interface Creator {
      @Nonnull Data create(@Nullable Hero hero);
    }
  }
}
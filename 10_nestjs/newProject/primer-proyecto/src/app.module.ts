import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { UsersDModule } from './users-d/users-d.module';
import { UsersModule } from './users/users.module';
import { ChatsModule } from './chats/chats.module';

@Module({
  imports: [UsersDModule, UsersModule, ChatsModule],
  exports: [],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}

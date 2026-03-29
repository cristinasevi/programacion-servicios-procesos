import { Injectable } from '@nestjs/common';

@Injectable()
export class UsersService {
  public listUsers() {
    return [
      { id: 1, name: 'John Doe' },
      { id: 2, name: 'John Doe' },
    ];
  }
}
